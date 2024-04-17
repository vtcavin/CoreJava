package Lab14;
import java.util.Arrays;
import java.util.Scanner;
public class Array_2D {
	void array_2d() {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter row size: ");
			int row=sc.nextInt();
			System.out.println("Enter colsize: ");
			int col=sc.nextInt();
			int[][] arr=new int[row][col];
			System.out.println(Arrays.deepToString(arr));
			System.out.println("Enter"+row*col+"values: ");
			for(int i=0;i<row;i++)
			{
			  for(int j=0;j<col;j++)
			  {
			    arr[i][j]=sc.nextInt();
			   }
			}
			
			for(int i=0;i<row;i++)
			{
			  for(int j=0;j<col;j++)
			  {
			    System.out.print(arr[i][j]);
			   }
		}
			sc.close();
		}
		public static void main(String[] args) {
			Array_2D ar = new Array_2D();
			ar.array_2d();
		}
}


