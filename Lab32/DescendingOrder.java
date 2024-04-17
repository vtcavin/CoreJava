package Lab32;
public class DescendingOrder {
	public static void main(String[] args) {
		//arrays in ascending order
	        int[] arr1 = {10,54,82,24,38};
	        int[] arr2 = {5,11,27,36,72};
	        int[] result=mergeDescending(arr1,arr2);
	        System.out.println("Merged Array in Descending Order:");
	        for (int num : result) {
	            System.out.print(num+" ");
	        }
	    }
		public static int[] mergeDescending(int[] arr1, int[] arr2) {
			int n1 = arr1.length;
	        int n2 = arr2.length;
	        int[] result = new int[n1+n2];
	        int i=n1-1;   
	        int j=n2-1;   
	        int k=0;      
	        while (i>=0 && j >= 0) {
	        	
	            if (arr1[i]>=arr2[j]) {
	                result[k++]=arr1[i--];
	            } 
	            else {
	                result[k++]=arr2[j--];
	            }
	        }
	        while (i>=0) {
	            result[k++] = arr1[i--];
	        }
	        while (j>=0) {
	            result[k++]=arr2[j--];
	        }

	        return result;
	    }
	}

/*
 Output:-
 Merged Array in Descending Order:
72 38 36 27 24 82 54 11 10 5 
 */

