package Lab7;

public class Constructor
{
	public static void a() {
		System.out.println("a method");
	}
	
	public Constructor()
	{
		System.out.println("Default Constructor is called");
	}
	public Constructor(int a , int b)
	{
		System.out.println("Parameterized Constructor is called:"+(a+b));
	}
	
	public static void main(String[] args)
	{
		Constructor obj=new Constructor();
		Constructor obj1=new Constructor(30,50);
		
		a();
	}
	
}
