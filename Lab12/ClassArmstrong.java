package Lab12;
import java.util.Scanner;
public class ClassArmstrong {
	static void armstrongNumber() {
		 Scanner sc = new Scanner(System.in);
   	    System.out.println("Enter number: ");
		    int a = sc.nextInt();
	        int sum=0,count=0,temp=a,temp1=a;
	        while(temp>0) {
	        	temp=temp/10;
	        	count++;
	        }
			while(temp1>0) {
				int rem=temp1%10;
				sum=(int)(sum+Math.pow(rem,count));
				temp1=temp1/10;
			}
	     
	        if( sum == temp1) {
	        	System.out.println("Number is Armstrong");
	        	}
	        	else {
		        	System.out.println("Number is not Armstrong");
	        	}
	        sc.close();
       
	}
	
       public static void main(String[] args) {
       	
			ClassArmstrong.armstrongNumber();
       }

}


