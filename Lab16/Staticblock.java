package Lab16;

public class Staticblock {
	static int a=5;
		
		//Non-Static Block
		void NonStatic(){
			System.out.println("Non-Static Method");
		}
		
		//Public Static Block
		public static void PublicStatic(){
			System.out.println("Public Method");
		}
		
		//Static Block 2
		static{
			System.out.println("Static Block 2");
			System.out.println(a);
		}
		static{
			System.out.println("Static Block 1");
		}
		
		public static void main(String[] args) {
			Staticblock obj= new Staticblock();
			obj.NonStatic();
			Staticblock.PublicStatic();	
		}
		
		//Static Block-3
		static {
			System.out.println("Static Block 3");
		}

}

/*
Output:

Static Block 2
7
Static Block 1
Static Block 3
Non-Static Method
Public Method

*/