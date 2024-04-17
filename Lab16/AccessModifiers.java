package Lab16;

public class AccessModifiers {

	//1. Can be accessed anywhere(another package, another class)
	public void Public()
	{
		System.out.println("Public method");
	}
	
	//2. Can be accessed within the same package
	void Default()
	{
		System.out.println("Default method");
	}
	
	//3. Can be accessed within the same class
	private void Private()
	{
		System.out.println("Private  method");
	}
	public static void main(String[] args) 
	{
		AccessModifiers obj=new AccessModifiers();
		obj.Public();
		obj.Default();
		obj.Private();
	}

	
}
/*
Output:
Public method
Default method
Private  method

*/
