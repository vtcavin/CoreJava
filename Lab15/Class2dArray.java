package Lab15;
import java.util.*;
public class Class2dArray {
	static void swapDiagonals() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter row size: ");
		int rows=sc.nextInt();
		System.out.println("Enter col size: ");
		int coln=sc.nextInt();
		int[][] arr=new int[rows][coln];
		System.out.println("Enter"+rows*coln+"values: ");
		for(int i=0;i<rows;i++)
		{
		  for(int j=0;j<coln;j++)
		  {
		    arr[i][j]=sc.nextInt();
		   }
		}
		for(int i=0;i<rows;i++)
		{
		  for(int j=0;j<coln;j++)
		  {
			 int temp= arr[0][0];
			 arr[0][0] = arr[0][1];
			 arr[0][1] = temp;
			 int temp1= arr[1][1];
			 arr[1][1] = arr[1][2];
			 arr[1][2] = temp1;
		System.out.print(arr[i][j]);
		   }
		  System.out.println();
		}
		sc.close();
	}
	public static void main(String[] args)
    {
		Class2dArray.swapDiagonals();
    }
}


	 