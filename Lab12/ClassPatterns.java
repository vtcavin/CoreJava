package Lab12;
import java.util.Scanner;
public class ClassPatterns {
	Scanner sc = new Scanner(System.in);
	void starPattern() {
        System.out.println("Star:");
		int n=5;

        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n;j++) {
                if (i==j || i+j==n+1 || i==(n/2)+1 || j==(n/2)+1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
     }
	void diamondPattern() {
        System.out.println("Diamond:");
		int n=4;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");   
			}
			for(int j=0;j<2*i+1;j++) {  
				System.out.print("*");
			}
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=0;i<n-1;i++) {
			System.out.print(" ");    
		  for(int j=0;j<i;j++) {
			System.out.print(" ");    
		}
		  for(int j=0;j<2*(n-1)-(2*i+1);j++) {  
			System.out.print("*");
		}
		  for(int j=0;j<i;j++) {
			System.out.print(" ");
		}
			System.out.println();

	  }
	}
	public static void main(String[] args){
    	ClassPatterns cp = new ClassPatterns();
    	cp.starPattern();
    	cp.diamondPattern();
    	
    	
    }
}
