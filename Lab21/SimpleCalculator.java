package Lab21;
import java.util.Scanner;
public class SimpleCalculator {
	void m1() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter 1st number");
            double n1 = sc.nextDouble();
            System.out.println("Enter 2nd number");
            double n2 = sc.nextDouble();
            System.out.println("Enter an operator to perform (+, -, *, /)");
            char n3 = sc.next().charAt(0);
            double result;
            switch (n3) {
            case '+':
                    result = n1 + n2;
                    System.out.println("Addition of " + n1 + " and " + n2 + " is " + result);
                    break;
            case '-':
                    result = n1 - n2;
                    System.out.println("Subtraction of " + n1 + " and " + n2 + " is " + result);
                    break;
            case '*':
                    result = n1 * n2;
                    System.out.println("Multiplication of " + n1 + " and " + n2 + " is " + result);
                    break;
            case '/':
                    if (n2 != 0) {
                        result = n1 / n2;
                        System.out.println("Division of " + n1 + " and " + n2 + " is " + result);
                    } else {
                        throw new ArithmeticException("Cannot divide by zero"); 
                    }
                    break;

                default:
                    throw new IllegalArgumentException("Invalid operator");
            
            }
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            System.out.println("End of statement");
        }
   
    }
	
	public static void main(String[] args) {
        SimpleCalculator obj = new SimpleCalculator();
        obj.m1();
     
	}
}

