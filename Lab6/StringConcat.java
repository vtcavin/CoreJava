package Lab6;
import java.util.Scanner;
public class StringConcat {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Concatination of Strings");
		System.out.println("Enter a string");
		String s1=sc.next();
		System.out.println("Enter 2nd String");
		String s2=sc.next();
		System.out.println("Concatenation of two strings is:");
		System.out.println(s1+""+s2);
	}
}
