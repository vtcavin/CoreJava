package Lab30;
import java.util.Arrays;
public class BubbleSortAscending {
    static int[] arr = {4,2,8,9,3,1};
    void ascending() {
		System.out.println("Original Array: "+Arrays.toString(arr));
		int n=arr.length;
		int temp=0;
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-1-i;j++) {  
			if(arr[j]>arr[j+1]){
				  temp=1;   
				  temp=arr[j];    
				  arr[j]=arr[j+1];
				  arr[j+1]=temp;
			  }
	     
			}
			if(temp==0) {
				break;
			}
			
		}	
		System.out.println("Sorted Array using bubble sort: "+Arrays.toString(arr));
			
	}
	
		void ascendingSort() {
		
		
		Arrays.sort(arr);
		
		System.out.println("Sorted Array using sort : "+Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
		BubbleSortAscending obj= new BubbleSortAscending();
		
		obj.ascending();
		obj.ascendingSort();
		
	}
}