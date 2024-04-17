package Lab30;
import java.util.Arrays;
import java.lang.String;
public class BubbleSortAlphabetic {
	static String[] arr = {"BubbleSort","InsertionSort","SelectionSort","Mergesort"};
	void alphabetic(){
		System.out.println("Original Array: "+Arrays.toString(arr));
		int n=arr.length;
		 String temp;
		 for (int i=0;i<n-1;i++) {
			 for (int j=0; j<n-i-1;j++) {
				   if (arr[j].compareTo(arr[j+1])>0) { 
	                   temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
			 
	        }
		
		System.out.println("Sorted Array using bubble sort: "+Arrays.toString(arr));
			
		
	}
	void alphabeticSort() {
		Arrays.sort(arr);
		System.out.println("Sorted Array using sort method: "+Arrays.toString(arr));

	}
	public static void main(String[] args) {
    	BubbleSortAlphabetic obj = new BubbleSortAlphabetic();
    	obj.alphabetic();
    	obj.alphabeticSort();
    	
    	
    }
}
