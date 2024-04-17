package Lab12;
import java.util.Scanner;
public class classGCDLCM {
	 Scanner sc = new Scanner(System.in);
	 void findGCD(){
			System.out.println("Enter 1st number: ");
		    int a1 = sc.nextInt();
			System.out.println("Enter 2nd number: ");
		    int b1 = sc.nextInt();
		    int gcd = 1;
		    for (int i=1; i<=a1 && i<=b1;++i) {
		      if (a1%i==0 && b1%i==0)
		        gcd = i;
		    }
		    System.out.println("The GCD of two numbers is "+ gcd);
		}
		void findLCM(){
			System.out.println("Enter 1st number: ");
			int a1 = sc.nextInt();
			System.out.println("Enter 2nd number: ");
		    int b1 = sc.nextInt();
		    int lcm=0;
		    lcm = (a1 > b1) ? a1 : b1;
		    while(true) {
		      if(lcm%a1==0 && lcm%b1==0 ){
		        System.out.printf("The LCM of two numbers is :"+lcm);
		        break;
		      }
		      ++lcm;}
		    }
		 public static void main(String[] args) {
	    	classGCDLCM GL = new classGCDLCM();
	    	GL.findGCD();
	    	GL.findLCM();
	    }
	}


