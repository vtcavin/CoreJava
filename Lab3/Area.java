package Lab3;

public class Area {
	static void circle() {
		int radius=5;
		double c;
		double pi=3.14;
		c=pi*radius*radius;
		System.out.println("Area of a circle: "+c);
	}
	
	static void rectangle() {
		int l=4,b=6,P,A;
		A=l*b;
		P=2*(l+b);
		System.out.println("Area of a Rectangle: "+A);
		System.out.println("Perimeter of a Rectangle: "+P);
	}
	
	static void square() {
		int s=7;
		double SA=s*s;
		double SP=4*s;
		System.out.println("Area of a Square: "+SA);
		System.out.println("Perimeter of a Square: "+SP);
	}
	
	public static void main(String[] args) {
		Area.circle();
		Area.rectangle();
		Area.square();
	}
}
