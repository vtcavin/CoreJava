package Lab32;
import java.util.Random;
public class MergeSortTimeAnalysis {
	//Merge sort algorithm
    public static void merge(int[] arr, int low, int mid, int high){
    	int k=low, i=low, j=mid+1;
    	int [] temp=new int [arr.length]; 
       while(i<=mid && j<=high){
    		if (arr[i]<=arr[j]) {
    	        temp[k++]=arr[i++];
    	     }
    	     else {
    	        temp[k++]=arr[j++];
    	     }
    	        
    	}
      
        //copy elements 
        while(i<=mid) {	
        	temp[k++]=arr[i++];
        }
        
        while (j<=high) {
        	temp[k++]=arr[j++];
        }
        for (i=low; i<=high; i++) {
        	arr[i]=temp[i];
        }
    
    }
    
    public static void mergeSort(int[] arr, int low, int high){
    	if (high<=low) { // if run size<=1
    	    
        	return;
        }
    	int mid =(low+high)/2;
        mergeSort(arr, low, mid);       
        mergeSort(arr, mid+1, high);  
        merge(arr, low, mid, high);   
           
    }
    public static int[] generateRandomArray(int size) {
    	
        int[] arr = new int[size];
        Random r=new Random();
        for (int i=0; i <size; i++) {
            arr[i] =r.nextInt();
        }
        return arr;
    }
    public static long measureMergeSortTime(int size) {
    	int[] arr = generateRandomArray(size);
        long startTime = System.nanoTime();
        mergeSort(arr, 0, arr.length - 1); 
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    public static void main(String[] args) {
        
    	
        int[] sizes = {5000, 6000, 10000, 25000, 30000};

     System.out.println("Size of Array\tTime Taken (nanoseconds)");
     for (int size : sizes) {
            long timeTaken =measureMergeSortTime(size);
            System.out.println(size +timeTaken);
        }
    }
}

/*
  Size of Array	Time Taken (nanoseconds)
5000			21855100
6000			39509200
10000			57631800
25000			205088000
30000			330091900
*/
