package Lab13;
import java.util.Scanner;
public class Array_Sum_Average {
	public static void main(String[] args) {
		int n,sum=0;
		float average;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter numbers ");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter all Elements");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum:"+sum);
		average=(float)sum/n;
		System.out.println("Average:"+average);
	s.close();
	}
	
}
