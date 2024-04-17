package Ichat_coding1;
import java.util.Scanner;
public class BMI_Calculator {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            System.out.println("Enter gender: ");
            String gender = sc.next();
            System.out.println("Enter height (in meters): ");
            double height = sc.nextDouble();
            System.out.print("Enter mass (in kilograms): ");
            double mass = sc.nextDouble();
            // Calculate BMI
            double BMI = mass/ (height*height);
            System.out.println("Converted BMI"+ BMI);
            if (BMI<18.5) {
            System.out.println("Underweight");
            } else if (BMI>= 18.5 && BMI <= 24.9) {
            	System.out.println("Normal weight");
            } else if (BMI >= 25 && BMI <= 29.9) {
            	System.out.println("Over weight");
            } else {
            	System.out.println("Obesity");
            }
           // if they want to calculate for another person
            System.out.print("Calculate BMI for another person? yes/no: ");
            String anotherperson = sc.next().toLowerCase();
            if (anotherperson.equals("no") || anotherperson.equals("n")) {
            	System.out.println("Exit the loop");
                break;
            }
        }

        
        sc.close();
    }
}
