package Lab_9;
import java.util.Scanner;
public class Simple_Interest {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal amount: ");
        int Principle=sc.nextInt();
        System.out.println("Enter number of years: ");
        int Time=sc.nextInt();
        double Rate;   
        if(Principle>10000) {
        	Rate=10; // 10% interest
        }
        else if(Principle >5000){
        	Rate=8; // 10% interest

        }
        else {
            Rate =5; // 5% interest 
        }
        double SI=(Principle*Rate*Time)/100;
        
        System.out.println("Simple Interest is: " + SI);
	}
	
}


/*

Output:

Enter principal amount: 
15000
Enter number of years: 
5
Simple Interest is: 7500.0

Enter principal amount: 
8000
Enter number of years: 
3
Simple Interest is: 1920.0

Enter principal amount: 
7000
Enter number of years: 
4
Simple Interest is: 2240.0
*/