package Lab18;
public class Shapes {
	void area(int a) {
	double circle = (3.14*a*a);
	System.out.println("Area of the circle is: "+circle);
	}
	void area(double b,double h) {
		double triangle =(0.5*b*h);		
		System.out.println("Area of the triangle is: "+triangle);
	}
	void area(int l,int b) {
		int rectangle=(l*b);
		System.out.println("Area of the rectangle is: "+rectangle);
		}
	public static void main(String[] args) {
		Shapes obj=new Shapes();
		obj.area(7);
		obj.area(4.9,9.6);
		obj.area(5,6);

	}
}

