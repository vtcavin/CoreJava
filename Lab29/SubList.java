package Lab29;
import java.util.ArrayList;
import java.util.Scanner;
public class SubList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of ArrayList:");
		int n=sc.nextInt();
		ArrayList<Integer>data=new ArrayList<>(n);
	     System.out.println("Enter the elements into ArrayList:");
	     for(int i=0;i<n;i++) {
	    	 data.add(sc.nextInt());
	      }
	     System.out.println(data);
	     //printing sublists
	     for(int i=0;i<n;i++) {
	    	for(int j=i+1;j<=n;j++) {
		      System.out.println(data.subList(i, j));	
		    }
	     }
	}
}

/*
Output:-
Enter size of ArrayList:
5
Enter the elements into ArrayList:

1 2 3 4 5
[1, 2, 3, 4, 5]
[1]
[1, 2]
[1, 2, 3]
[1, 2, 3, 4]
[1, 2, 3, 4, 5]
[2]
[2, 3]
[2, 3, 4]
[2, 3, 4, 5]
[3]
[3, 4]
[3, 4, 5]
[4]
[4, 5]
[5]
*/

