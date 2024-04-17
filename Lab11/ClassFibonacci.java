package Lab11;
import java.util.Scanner;
public class ClassFibonacci {
	static Scanner sc = new Scanner(System.in);
	int nthFibonacciTerm(int n) {
			  int firstterm=0; 
			  int secondterm=1;
			System.out.println("Fibonacci Series "+n+" is: ");
	        for(int i=0;i<n;++i) {      
	             System.out.println(firstterm + " ");  
	             int nextTerm = firstterm + secondterm;
	             firstterm=secondterm;
				 secondterm=nextTerm; 		
			 }
			return n;	
		}
		  public static void main(String args[])
		    {
			  ClassFibonacci fib =new ClassFibonacci();
			  System.out.println("Enter n value from user");
			  fib.nthFibonacciTerm(sc.nextInt());
		    }
	}


