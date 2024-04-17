package Lab8;
import java.util.Scanner;

public class Month_In_Year {
	static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		
        System.out.print("Enter a month in a year ");
        String month = sc.next();
		switch(month) {
		case "Jan":
			System.out.println("1st Month");
			break;
		case "Feb":
			System.out.println(" 2nd month ");
			break;
			
		case "Mar":
			System.out.println(" 3rd month ");
			break;
		
		case "Apr":
			System.out.println("4th month");
			break;
			
		case "May":
			System.out.println("5th month");
			break;
			
		case "Jun":
			System.out.println("6th month");
			break;
			
		case "Jul":
			System.out.println("7th month");
			break;
		
		case "Aug":
			System.out.println("8th month");
			break;
		
		case "Sep":
			System.out.println("9th month");
			break;
			
		case "Oct":
			System.out.println("10th month");
			break;
			
		case "Nov":
			System.out.println("11th month");
			break;
			
		case "Dec":
			System.out.println("12th month");
			break;
	    
		default:
			System.out.println("Enter only months");

	}
	}
}


