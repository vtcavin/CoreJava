package Lab8;

public class GreatestSmallest {

	int a=15, b=30, c=10;

	void greatest() {
		if(a>b && a>c) {
			System.out.println(a + " is greater");
		}
		if (b>a && b>c) {
			System.out.println(b + " is greater");
		}
		else {
			System.out.println(c + " is greater");
		}
	}
	
	void smallest() {
		
		if(a<b && a<c) {
			System.out.println(a + " is smallest");
		}
		
		if (b<a && b<c) {
			System.out.println(b + " is smallest");
		}
		else {
			System.out.println(c + " is smallest");
		}
	}
	
	
	public static void main(String[] args) {
		GreatestSmallest GS = new GreatestSmallest();
		GS.greatest();
		GS.smallest();
	}
}

