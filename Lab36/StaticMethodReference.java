package Lab36;
import java.util.Scanner;
interface Calculator {
    double calSquare(int num);
}

public class StaticMethodReference {
	static int square(int num) {
        return num * num;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calculator sq = StaticMethodReference::square;
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		//calling interface 
		double result= sq.calSquare(n);
		System.out.println("Square of " + n + " is: " + result);
		sc.close();
	}
}

/*
 Enter a number: 
12
Square of 12 is: 144.0
*/

