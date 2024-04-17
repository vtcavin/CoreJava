package Interview;
public class Traiangle{
public static void printTriangle(int n) {
	int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j+"");
			}
			System.out.println();
		}
		
	}
	public static void main(String args[]) {
		int n=6;
		printTriangle(n);
	}
	
}
