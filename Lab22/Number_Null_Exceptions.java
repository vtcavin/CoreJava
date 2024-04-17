package Lab22;
import java.util.Scanner;
public class Number_Null_Exceptions {
	void a1(){
	    Scanner sc=new Scanner(System.in);
	    try{
	    	System.out.println("Enter a number: ");
	    	String input=sc.nextLine();
            if("null".equals(input)){
					throw new NullPointerException("cannot be null");
					
			}
	    	 int newinput = Integer.parseInt(input);
	    	 System.out.println("Converted integer: " + newinput);
	    }
	   catch (NullPointerException e) {
            System.out.println("NullPointerException occurred");
            System.out.println(e.toString());
    		System.out.println("Enter an integer ");

	    }
	    catch(NumberFormatException e){
	    	System.out.println("Exception occured");
	    	System.out.println(e.toString());
    		System.out.println("Enter an integer ");
	    }
	    		
	    finally {
    		System.out.println("End of statement");

	    }
	    

	 }
	   public static void main(String[] args) {
			Number_Null_Exceptions obj = new Number_Null_Exceptions();
			obj.a1();
		}
}

