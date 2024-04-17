package Lab11;
import java.util.Scanner;
public class VowelOrConsonent {
	
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter a character : ");  
		char c = sc.next().charAt(0);   
		
		if(c=='a' || c=='e' || c =='i' || c=='o' || c=='u') {
			System.out.println(c + " is vowel");
		}
	
		else if(c=='A' || c=='E' || c =='I' || c=='O' || c=='U'){
			System.out.println(c + " is Vowel");		
		}
		
		else {
			System.out.println(c + " is consonent");	
	}
		
	}

}


