package Lab4;

public class ClassOperator{
	static void unary() {
		int a=5,b=10;
		System.out.println("Unary Operators");
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(--b);
		System.out.println(b--);
		System.out.println(b);
	}
	void arithemetic() {
		int a=10,b=5;
		System.out.println("Arithemetic Operators");
		System.out.println("Addition is:"+(a+b));
		System.out.println("Subtraction is:"+(a-b));
		System.out.println("Multiplication is:"+(a*b));
		System.out.println("Division is:"+(a/b));
		System.out.println("Modulus Division is:"+(a%b));
	}
	
	void logical() {
		int a=20,b=12,c=5;
		System.out.println("Logical Operators");
		System.out.println((a>b)||(b>c));
		System.out.println((a>b)||(b<c));
		System.out.println((a<b)||(b>c));
		System.out.println((a<b)||(b<c));
		System.out.println((a>b)&&(b>c));
		System.out.println((a>b)&&(b<c));
		System.out.println((a<b)&&(b>c));
		System.out.println((a<b)&&(b<c));
	}
	
	static void Bitwise() {
		int a=5,b=9;
		System.out.println("Bitwise Operators");
		System.out.println(a>>b);
		System.out.println(a<<b);
		System.out.println(a>>b);
		System.out.println(a^b);
		System.out.println(a&b);
		System.out.println(a|b);
	}
	
	void assignment() {
		System.out.println("Assignment Operators");
		int a=2,b=3,c=6;
		System.out.println(a+=b);
		System.out.println(a-=b);
		System.out.println(a*=c);
		System.out.println(b/=c);
		
		
	}
	
	static void relational() {
		int a=10,b=20,c=30;
		System.out.println("Relational Operators");
		System.out.println(a>b);
		System.out.println(b<c);
		System.out.println(a>=b);
		System.out.println(b<=c);
		System.out.println(a==b);
		System.out.println(b!=c);
		String s1="Cavin";
		String s2="cavin";
		System.out.println(s1==s2);
	}
	
	public static void main(String[] args) {
		ClassOperator o=new ClassOperator();
		ClassOperator.unary();
		o.arithemetic();
		o.logical();
		ClassOperator.Bitwise();
		o.assignment();
		ClassOperator.relational();
	}
}
	

