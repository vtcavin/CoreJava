package Lab7;

import java.util.Scanner;
public class PositiveOrNegative
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args)
	{
		int num;
		System.out.println("Enter a number");
		num = sc.nextInt();
		if(num>=0)
		{
			System.out.println("The number is positive");
		}
		else {
		
			System.out.println("The number is negative");
			
		}
		
	}

}
