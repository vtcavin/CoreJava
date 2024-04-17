package Lab34;
import java.util.Scanner;
import java.util.Stack;
public class PalindromeStack {
	static Stack<Character> stack= new Stack<>();
	void palindrome() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s= sc.next();
		int n=s.length();
		//pushing characters into the stack
		for(int i=0;i<n;i++) {
			stack.push(s.charAt(i));
         }
		int i;
		for(i=0;i<n;i++) {
			if(stack.pop()!= s.charAt(i)) {
	            System.out.println(s + " is not a palindrome");
	            break;
			}  
		}
		if (i==n) {
	            System.out.println(s + " is a palindrome");
	        }
        
	}
    public static void main(String[] args) {
    	PalindromeStack p=new PalindromeStack();
    	p.palindrome();
    }
}

/*
 Output:-
 Enter a string
racecar
racecar is a palindrome

Enter a string
car
car is not a palindrome
*/
 
 