package Lab31;
import java.util.Scanner;
public class InsertionSortLexicalOrder {
	void lexicalSort() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
        int n = sc.nextInt();
        //creating string array
        System.out.println("Enter strings in array: ");
		String[] arr= new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
		}
		for (int i=1;i<n;i++) {
		    String k=arr[i];
            int j=i-1;
            // compare shift elements that are greater than k
            while (j>=0 && arr[j].compareTo(k)>0) {
            	arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=k;
        }
        System.out.println("Sorted List:" );
        for(String a : arr) {
    		System.out.print(a+" ");
        }       
        sc.close();
}
public static void main(String[] args) {
	InsertionSortLexicalOrder obj = new InsertionSortLexicalOrder();
		obj.lexicalSort();
	}
	
}

/*
 Output:-
 Enter the string: 
5
Enter strings in array: 
sql
html
java
python
react
Sorted List:
html java python react sql 
 
 */
