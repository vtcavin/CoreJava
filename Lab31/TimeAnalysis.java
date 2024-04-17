package Lab31;
import java.util.Random;
public class TimeAnalysis {
	//generating random array
    public static int[] generateRandomArray(int n) {
        int[] arr = new int[n];
        Random r = new Random();
        for (int i=0;i<n;i++) {
        	arr[i]=r.nextInt(1000); 
        }
        return arr;
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n-1;i++) {
        	int minIndex = i;
            for (int j =i+1;j<n;j++) {
            	//compare
                if (arr[j] < arr[minIndex]) { 
                    minIndex = j;
                }
            }
            
            //swap minimum
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i=0;i<n-1;i++) {
        	
            for (int j=0;j<n-i-1;j++) {
            	
                if (arr[j]>arr[j+1]) {
                	int temp=arr[j];     
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i=1;i<n;i++) {
        	
            int key = arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
    	int[] arr = generateRandomArray(1000);
    	long startTime = System.nanoTime();
        selectionSort(arr.clone());
        long selectionSortTime = System.nanoTime()-startTime;
        startTime = System.nanoTime();
        bubbleSort(arr.clone());
        long bubbleSortTime = System.nanoTime()-startTime;
        startTime = System.nanoTime();
        insertionSort(arr.clone());
        long insertionSortTime = System.nanoTime()-startTime;
        System.out.println("Time taken for Selection Sort: " + selectionSortTime + " nanoseconds");
        System.out.println("Time taken for Bubble Sort: " + bubbleSortTime + " nanoseconds");
        System.out.println("Time taken for Insertion Sort: " + insertionSortTime + " nanoseconds");
    }
}


/*
 Output:
 Time taken for Selection Sort: 2002200 nanoseconds
Time taken for Bubble Sort: 4182000 nanoseconds
Time taken for Insertion Sort: 2188200 nanoseconds
*/
 

