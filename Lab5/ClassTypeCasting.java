package Lab5;

public class ClassTypeCasting {
	static ClassTypeCasting tc=new ClassTypeCasting();
	
	    static void ImplicitTypeCasting() {
		System.out.println("Implicit Typecasting Examples");
		System.out.println("Converting int to long");
		int i=245;
		long l=i;
		System.out.println(i);
		System.out.println(l);
		
		System.out.println("Converting byte to short");
		byte b=4;
		short s=b;
		System.out.println(b);
		System.out.println(s);
	}

		void ExplicitTypeCasting() {
		System.out.println("Explicit Typecasting Examples");
		System.out.println("Converting double to float");
		double d1=12568.5894;
		float f1=(float)d1;
		System.out.println(d1);
		System.out.println(f1);
		
		System.out.println("Converting char to int");
		char ch='C';
		int i=(int)ch;
		System.out.println(ch);
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		ImplicitTypeCasting();
		tc.ExplicitTypeCasting();
	}
}
	
		
		
		
		
		
		
		
	
