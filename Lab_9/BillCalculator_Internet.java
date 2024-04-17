package Lab_9;
import java.util.Scanner;
public class BillCalculator_Internet {
public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter gb that is totally consumed: ");
        int dataConsumed=sc.nextInt();
        int billAmt;
        if (dataConsumed<10) {
            billAmt=300; 
        } 
        else if (dataConsumed<=30) {
        	//basis charge>30
            billAmt=300+5*(dataConsumed-10); 
        } 
        else {
        	/*basic charge for first 30GB & 
        	additional charge for>30GB*/
            billAmt=400+3*(dataConsumed-30); 
        }
        System.out.println("Monthly Bill Amount: Rs. " + billAmt);

    }
}

/*
 Output:-
 Enter gb that is totally consumed: 
10
Monthly Bill Amount: Rs 300

Enter gb that is totally consumed: 
20
Monthly Bill Amount: Rs 350

 */


