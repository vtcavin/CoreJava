package Lab26;
import java.util.Scanner;
public class ReverseString {
	void reverseWordsInString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = sc.nextLine();
		String[] arr = input.split(" ");
		for (String word : arr) {
            StringBuilder revWord = new StringBuilder(word);
            System.out.print(revWord.reverse().append(" "));
        }
		sc.close();

		 
	}
	public static void main(String[] args) {
	
		ReverseString obj = new ReverseString();
		obj.reverseWordsInString();
	
	}
}
