package Lab14;
import java.util.*;
public class MatrixAddition {
	void matrixaddition() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter rows of array: ");
		int row=sc.nextInt();
		System.out.println("Enter cols of array: ");
		int col=sc.nextInt();
		int[][] a1=new int[row][col]; 
		System.out.println(Arrays.deepToString(a1));
		int[][] a2=new int[row][col];
		System.out.println(Arrays.deepToString(a2));
		System.out.println("Enter values of array in matrix ");
		for(int i=0;i<row;i++)
		{
		  for(int j=0;j<col;j++)
		  {
		    a1[i][j]=sc.nextInt();
		   }
		}
		for(int i=0;i<row;i++)
		{
		  for(int j=0;j<col;j++)
		  {
		    a2[i][j]=sc.nextInt();
		   }
		}
		int[][] sum=new int[row][col];
		for(int i=0;i<row;i++)
		{
		  for(int j=0;j<col;j++)
		  {
			sum[i][j]=a1[i][j]+a2[i][j];
		    System.out.print(sum[i][j]);
		   }
		  System.out.println();
		}
		sc.close();
	}
	public static void main(String[] args) {
		MatrixAddition a = new MatrixAddition();
		a.matrixaddition();
	}
}


