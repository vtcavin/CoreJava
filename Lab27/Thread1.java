
package Lab27;
public class Thread1 extends Thread{
	public void run() {
		int count =0;
		int sum=0;
		for (int i=1;i<=10;i++) { 
             sum=sum+i;
             count++;
        }
		System.out.println(Thread.currentThread().getName()+" "+(sum/count));

	}
}
