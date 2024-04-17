package Lab36;
import java.util.Scanner;
interface StringOperations {
    String op(String str);
}
public class LambdaStringManipulation {
	public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter a string: ");
	        String input = sc.nextLine();
	        //lambda expressions for upper case
	        StringOperations upperCase = str->str.toUpperCase();
	        //lambda expressions for lower case
	        StringOperations lowerCase = str->str.toLowerCase();
	         //reverse a string using string builder
	        StringOperations reverseString = str-> {
	        	StringBuilder rev = new StringBuilder();
	            int n=str.length();
	            for (int i=n-1; i>=0;i--) {
	                rev.append(str.charAt(i)); 
	            }
	            return rev.toString();
	        };
	        System.out.println("Original String: " + input);
	        System.out.println("Uppercase: " + upperCase.op(input));
	        System.out.println("Lowercase: " + lowerCase.op(input));
	        System.out.println("Reversed: " + reverseString.op(input));
	    }
	}



/*
 Output:-
 Enter a string: 
Cavin
Original String: Cavin
Uppercase: CAVIN
Lowercase: cavin
Reversed: nivaC

 */
 
