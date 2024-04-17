package Lab37;
import java.io.Console;
public class Reading_From_Console {
	public static void main(String[] args) {
		Console console=System.console();
		if (console==null) {
			System.out.println("Console is not available");
			System.exit(1);
		}
		//taking inputs from console
		String n1 =console.readLine("Enter a number: ");
		String n2 =console.readLine("Enter another number: ");
		//converting to double from string
        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);
        //adding 2 numbers
		double sum=num1+num2;
		System.out.println("Addition of"+n1+" and"+n2+" is: "+sum);

		
	}

}

/*

Output:

C:\Hp\Cavin>cd C:\Users\Cavin\eclipse-workspace\Cavin\src

C:\Hp\Cavin\eclipse-workspace\Cavin\src>java Read_From_Console
Enter a number: 13
Enter another number: 8
Addition of 13 and 8 is: 21.0

C:\Hp\Cavin\eclipse-workspace\Cavin\src>java Read_From_Console
Enter a number: 6.5
Enter another number: 3.4
Addition of 6.5 and 3.4 is: 9.9
*/