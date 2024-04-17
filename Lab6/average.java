package Lab6;
import java.util.Scanner;
public class average {
	Scanner sc = new Scanner(System.in);
	
	void avg() {
	  System.out.print("Input first number: ");
	  int i1 = sc.nextInt();
	  
	  System.out.print("Input second number: ");
	  int i2 = sc.nextInt();
	  
	  System.out.print("Input third number: ");
	  int i3 = sc.nextInt();
	  
	  System.out.print("Input fourth number: ");
	  int i4 = sc.nextInt();
	  
	  System.out.print("Enter fifth number: ");
	  int i5 = sc.nextInt();
	  int avg=(i1+i2+i3+i4+i5)/5;
	   
	  System.out.println("Average of five numbers is: " +avg);
	 }
	
	public int average (int i, int j, int k, int l, int m) {
		return (i+j+k+l+m)/5;
		
	}
	public static void main(String[] args) {
		average a=new average();
		a.avg();
		int f=a.average(1,2,3,4,5);
		System.out.println("Average of 5 values is:"+f);
	}

}
