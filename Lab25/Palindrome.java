package Lab25;
import java.lang.String;
public class Palindrome {
	public class ClassPalindromeString {
		static void palindromeString(){
			String s1 = "racecar";
		    StringBuffer sb = new StringBuffer(s1);
		    sb.reverse();  
	        System.out.println("Reversed Stirng: "+sb);
	        String s2 = sb.toString();
		     if(s1.equals(s2)){
		         System.out.println("Palindrome");
		      } 
		      else {
		         System.out.println("Not a palindrome");
		      }
		}
		
		public static void main(String[] args) {
			palindromeString();
		}
	}
}
