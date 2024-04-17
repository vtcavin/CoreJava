package Lab29;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class ClassHashMapRenameKey {
	static void renameKey(HashMap<String,Integer>hashMap,String oldKey,String newKey) {
		if(hashMap.containsKey(oldKey)) {
			Integer value=hashMap.remove(oldKey);
			hashMap.put(newKey,value);
		   }
		}
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer>hashMap=new HashMap<>();
		//adding elements
		hashMap.put("apples",10);
		hashMap.put("bananas", 20);
		hashMap.put("mangoes", 15);
		hashMap.put("oranges", 200);
		hashMap.put("watermelons", 50);
		//replacing key
		System.out.println("Enter the key you want to replace:");
		String oldKey=sc.nextLine();
		System.out.println("Enter new key:");
		String newKey=sc.nextLine();
		renameKey(hashMap,oldKey,newKey);
		System.out.println("Before sorting: "+hashMap);
		List<String> sorted=new ArrayList<>(hashMap.keySet());
		Collections.sort(sorted);
		System.out.println("Sorted order of the keys is: ");
		for(String sort:sorted) {
			System.out.println(sort);
		}
		
	}
}

/*
Output:-
Enter the key you want to replace:
apple
Enter new key:
pomegranates
Before sorting: {oranges=200, watermelons=50, bananas=20, mangoes=15, apples=10}
Sorted order of the keys is: 
apples
bananas
mangoes
oranges
watermelons
 */


