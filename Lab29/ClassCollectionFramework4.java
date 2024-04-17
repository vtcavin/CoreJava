package Lab29;
import java.util.Scanner;
public class ClassCollectionFramework4 {
	static void printArr(int[]arr) {
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the row size of array:");
	int row=sc.nextInt();
	System.out.println("Enter the column size of array:");
	int col=sc.nextInt();
	//Creating an array
	int[][]arr=new int[row][col];
	System.out.println("Enter the "+row*col+" elements");
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	
	//printing the matrix
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	//number of rows and columns
    int rows=arr.length;
    int cols=arr[0].length;
    int[] max=new int[cols];
	int[] min=new int [cols];
	int[] sum=new int[cols] ;
	
	//initializing minarray with max value
	for(int j=0;j<cols;j++) {
    	min[j]=Integer.MAX_VALUE;
    }
	//calculating  max,min,sum arrays
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			
			if(arr[i][j]>max[j]) {
				max[j]=arr[i][j];
			}
			if(arr[i][j]<min[j]) {
				min[j]=arr[i][j];
			}
			sum[j]+=arr[i][j];
		}
	}
		
	System.out.println("Minimum:");
	printArr(min);
	
	System.out.println("Maximum:");
	printArr(max);
	
	System.out.println("Sum:");
	printArr(sum);
	
}
}

/*
Output:-
Enter the row size of array:
3
Enter the column size of array:
3
Enter the 9 elements
3 3
1  2  3
10 20 30
5  10 15

3 3 1 
2 3 10 
20 30 5 

Minimum:
2 3 1 

Maximum:
20 30 10 
Sum:
25 36 16 
*/

