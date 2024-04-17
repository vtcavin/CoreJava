package Lab28;
import java.util.LinkedList;
import java.util.Queue;
class MessageQueue {
	private Queue<String> msgs = new LinkedList<>();
    public static int Size = 4;
    public synchronized void sendMsg(String msg) {
    while(msgs.size()==Size) {
           
    		try {
                System.out.println("Queue is full");
                wait();
            } 
    		catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    	msgs.add(msg);
    	System.out.println("Sent message: "+msg);
        notifyAll();
    }
    public synchronized String receiveMsg() {
        
    	while(msgs.isEmpty()) {
           
    		try {
                System.out.println("Queue is empty");
                wait();
            } 
    		catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    	String message = msgs.poll();
        System.out.println("Received message: "+message);
        notifyAll(); 
        return message;
    }
}
class Sender implements Runnable {

       private MessageQueue msgQueue;
    public Sender(MessageQueue msgQueue) {
        this.msgQueue = msgQueue;
    }
    @Override
    public void run() {
        
    	for (int i=1;i<=10;i++) {
           
        	msgQueue.sendMsg("Message " + i);
           
        	try {
                Thread.sleep(1000); 
                } 
        	catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Receiver implements Runnable {
	private MessageQueue msgQueue;
	public Receiver(MessageQueue msgQueue) {
        this.msgQueue = msgQueue;
    }
    @Override
    public void run() {
        
    	for (int i=1;i<=10;i++) {  
    	
    		msgQueue.receiveMsg();  
            
    		try {
                Thread.sleep(1500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class MessagingSystem {

    public static void main(String[] args) {
       
    	MessageQueue msgQueue = new MessageQueue();
    	Thread senderThread = new Thread(new Sender(msgQueue));
        Thread receiverThread = new Thread(new Receiver(msgQueue));
        senderThread.start();
        receiverThread.start();
    }
}
