package Lab3;

public class Swap {
	int a=20,b=10;
   void variable() {
		int a=10,b=20;
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("Method 1");
		System.out.println("a "+a);
		System.out.println("b:"+b);
	}
	
	void a1() {
		int a=10,b=10;
		System.out.println("Method 2");
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
	}
	
	void b1() {
		int a=10,b=20;
		System.out.println("Method 3");
		a=b%a;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	public static void main(String[] args){
		Swap s = new Swap();
		s.variable();
		s.a1();
		s.b1();
	}
		
}
