package Lab7;

public class StaticMethod {
	static StaticMethod sm= new StaticMethod();
	
	String m1() {
		String b="java";
		System.out.println(sm.m2());
		return b;
	}
	int m2() {
		int a=10;
		System.out.println(sm.m3());
		return a;
	}
	float m3() {
		float d=3.4f;
		System.out.println(sm.m4());
		return d;
	}
	
	
	String m4(){
		String c="python";
		return c; 
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(sm.m1());
	}
	
}













