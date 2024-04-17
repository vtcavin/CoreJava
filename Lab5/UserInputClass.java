package Lab5;
import java.util.Scanner;
public class UserInputClass {
	static Scanner sc=new Scanner(System.in);
	
	void addition() {
		System.out.println("Enter value of a");
		int a=sc.nextInt();
		System.out.println("Enter value of b");
		int b=sc.nextInt();
		System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
		
	}
	
	void multiplication() {
		sc.nextLine();
		System.out.println("Enter value of c");
		double c=sc.nextDouble();
		System.out.println("Enter value of d");
		double d=sc.nextDouble();
		System.out.println("Multiplication of "+c+" and "+d+" is "+(c*d));
	}
	
	static void division() {
		sc.nextLine();
		System.out.println("Enter value of x");
		byte x=sc.nextByte();
		System.out.println("Enter value of y");
		byte y=sc.nextByte();
		System.out.println("Division of "+x+" and "+y+" is "+(x/y));
	}
	
	public static void main(String[] args) {
		UserInputClass i=new UserInputClass();
		i.addition();
		i.multiplication();
		UserInputClass.division();
		
	}
}
		
	
	
	


