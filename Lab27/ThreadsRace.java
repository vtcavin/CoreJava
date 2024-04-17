package Lab27;
public class ThreadsRace extends Thread{
	public void run()
	{	
		for(int i=1;i<=10;i++)
		{
		
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(5000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	
     }
	public static void main(String[] args){
		ThreadsRace obj1=new ThreadsRace();
		Thread t1=new Thread(obj1);
		t1.setName("Thread1");
		t1.setPriority(2);
		t1.start();
		
	
		Thread t2=new Thread(obj1);
		t2.setName("Thread2");
		t2.setPriority(6);  
		t2.start();
		
		
		Thread t3=new Thread(obj1);
		t3.setName("Thread3");
		t3.setPriority(9);	
		t3.start();

	}
	
}
