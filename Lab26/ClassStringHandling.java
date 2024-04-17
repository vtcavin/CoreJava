package Lab26;
import java.util.Arrays;
public class ClassStringHandling {
	void stringMethod(){
		 System.out.println("String Initialization");
		 String s1="Hello";
    	 System.out.println(s1);
   	     System.out.println("---------------------");
   	     //Concatenation
    	 String s2="Java";
    	 System.out.println(s1.concat(s2));
   	     System.out.println("---------------------");
   	     //Appending
    	 StringBuilder a1 = new StringBuilder("Java ");
    	 StringBuilder a2 = new StringBuilder("Program");
    	 System.out.println(a1.append(a2));
   	     System.out.println("---------------------");
   	     a1.setCharAt(0, 'g');
 		 System.out.println(a2);
   	     System.out.println("---------------------");

   	     a1.deleteCharAt(6);
    	 System.out.println(a1);
   	     System.out.println("---------------------");

   	     StringBuffer b1 =new StringBuffer("String");
 		 StringBuffer b2 =new StringBuffer("Handling");
    	 System.out.println(b1.reverse());
    	 System.out.println(b1.reverse());
   	     System.out.println("---------------------");


    	 
    	 StringBuffer b3= new StringBuffer("Buffer");
    	 System.out.println(b2.equals(b3)); 
 		 System.out.println(b2.equals(b3));
 		 
 		
 		 System.out.println(b1.toString().equals(b3.toString())); 
		 System.out.println(b2.toString().equals(b3.toString())); 
   	     System.out.println("---------------------");

		 
    	 System.out.println(s1.replace('B','G')); 
   	     System.out.println("---------------------");

    	 StringBuffer b4= new StringBuffer("Anudip");
 		 System.out.println(b4.toString().toLowerCase()); 
   	     System.out.println("---------------------");

   	     StringBuilder sb3 = new StringBuilder("Foundation");
 		 System.out.println(sb3.toString().toUpperCase()); 
 		 String s4="Cavin";
    	 String[] arr=s4.split("-");
    	 System.out.println(Arrays.toString(arr));
   	     System.out.println("---------------------");

    	 String s3="vadala";
    	 System.out.println(s3.repeat(3)); 
   	     System.out.println("---------------------");
 		 System.out.println(b2.charAt(3)); 
   	     System.out.println("---------------------");
   	     System.out.println(s3.indexOf('v'));
   	     System.out.println("---------------------");
		
	}
		
	
	public static void main(String[] args) {
		
		ClassStringHandling obj = new ClassStringHandling();
		obj.stringMethod();	
		
	}
	
}

