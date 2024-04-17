package Lab22;
import java.util.InputMismatchException; 
import java.util.Scanner;
public class InputMismatch{
	void a(){
		    Scanner sc=new Scanner(System.in);
		    try{
		    	System.out.println("Enter a number: ");
		    	int n=sc.nextInt();
		    	System.out.println(n+" is an Integer");
		    }
		    catch(InputMismatchException me){
		    		System.out.println("Exception occured");
		    		System.out.println(me.toString());
		    		System.out.println("Enter integer");
		    }
		    sc.close();
		    
		 }
		public static void main(String[] args) {
				InputMismatch obj = new InputMismatch();
				obj.a();
			}
		
	}

