package Ichat_coding1;
import java.util.Scanner;
public class simple_temperature_convertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter temperature in Celsius: ");
            if (sc.hasNextDouble()) {
                double celsius = sc.nextDouble();
                double fahrenheit = celsius* (9.0 / 5.0)  + 32.0;
                System.out.println("Converted temperature is Fahrenheit: " + fahrenheit);
                if (fahrenheit<32) {
                    System.out.println("Very cold");
                } else if (fahrenheit>=32 && fahrenheit<50) {
                    System.out.println("Cold");
                } else if (fahrenheit>=50 && fahrenheit<70) {
                    System.out.println("Mild");
                } else{
                    System.out.println("Warm");
                }

     System.out.println("If you want to convert another temperature? yes/no : ");
                String continueInput = sc.next().toLowerCase();

                if (continueInput.equals("no") || continueInput.equals("n")) {
                    System.out.println("Exit from loop");
                    break;
                }
            
                
            }
        }

        sc.close();
    }
}