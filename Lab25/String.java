package Lab25;
import java.util.Scanner;
public class String {
	static void frequencyOfStringCharacters() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string: ");
	String scanner =sc.nextLine();
	int alphabet=0;
	int digits=0;
	int whitespace=0;
	int specialchar=0;
	for(int i=0;i<sc.length();i++) {
			char ch=sc.charAt(i);
			if (Character.isLetter(ch)) {
				alphabet++;
	        } 
			else if (Character.isDigit(ch)) {
	        	digits++;
	        } 
			else if (Character.isWhitespace(ch)) {
	        	whitespace++;
	        } 
			else {
	        	specialchar++;
	        }
			

		}
		System.out.println("Alphabets count"+alphabet);
		System.out.println("Digits count"+digits);
		System.out.println("Whitespace count"+whitespace);
		System.out.println("Special character count"+specialchar);

		
		}

		public static void main(String[] args) {
			frequencyOfStringCharacters();
		}

	}



