package Lab28;
public class Multithreading extends Thread{
	public  void run(){	
	System.out.println(Thread.currentThread().getName());
			
		}
     public static void main(String[] args){
		 
		 Multithreading obj= new Multithreading();
		 Thread th1=new Thread(obj);
		 th1.setName("Thread 1");
		 th1.setPriority(1);	
		 try {
				Thread.sleep(4000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		 Thread th2 = new Thread(obj);
		 th2.setName("Thread 2");
		 th2.setPriority(10);	
		 try {
				Thread.sleep(6000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		 Thread th3 = new Thread(obj);
		 th3.setName("Thread 3");
		 th3.setPriority(3);
		 
				
		 try {
				Thread.sleep(6000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		 th1.start();
	     th2.start();
	     th3.start();

	        try {
	            th1.join();
	            th2.join();
	            th3.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
     }
}