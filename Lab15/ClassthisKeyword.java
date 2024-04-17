package Lab15;

public class ClassthisKeyword {
	int a=5;   
    int b=7;    
    void nonStaticMethod(){
   	System.out.println("Non-static method is used by this keyword"); 
    }
    static void StaticMethod(){
   	 System.out.println("Static method is used by this keyword"); 
   	
    }
    ClassthisKeyword(){
   	 System.out.println("Default constructor"); 
    }
    ClassthisKeyword(int a,int b){
    this();   
    System.out.println("Parameterized constructor: "+a+b);
    }
    public static void main(String[] args)
    {
   	 System.out.println("Main Method");
   	ClassthisKeyword tk=new ClassthisKeyword(3,5);
   }

}
