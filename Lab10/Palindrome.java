package Lab10;
import java.util.Scanner;
public class Palindrome {
	static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
			System.out.println("Enter a number");
			int num= sc.nextInt();
				  int a,temp,sum=0;
				  temp=num;   
				  
				  while(num>0){    
				   a=num%10; 
				   sum=(sum*10)+a; 
				   num=num/10; 
				  }    
				  
				  if(temp==sum)    
				   System.out.println("Number is Palindrome");    
				  else    
				   System.out.println("Number is not Palindrome");    
				}  
		}

