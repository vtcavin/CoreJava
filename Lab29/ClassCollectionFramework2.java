package Lab29;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class ClassCollectionFramework2 {
	public static void main(String[] args) {
		HashMap<String,String>hashMap=new HashMap<String,String>();
	    System.out.println("Enter data as [name=ID] or (enter \'exit\' to stop)");
	    Scanner sc=new Scanner(System.in);
	    while(true) {
		String ip=sc.nextLine();
		if(ip.equalsIgnoreCase("exit")) {
			break;
		}
		String parts[]=ip.split("=");
		if(parts.length!=2) {
			System.out.println("Invalid format!");
			continue;
		}
		hashMap.put(parts[0], parts[1]);
	}
	System.out.print("Input:"+hashMap);
    List<String> sorted=new ArrayList<>(hashMap.keySet());
	Collections.sort(sorted);
	System.out.println();
	System.out.println("Sorted order by name:");
	for(String key:sorted) {
		System.out.println(key+":"+hashMap.get(key));
		}
	
	}
}


/*
Output:-

Enter data as [name=ID] or (enter 'exit' to stop)
Cavin=ID1
Rahul=ID2
Akash=ID3
Shiva=ID4
Vishwas=ID5
exit

Input:{Rahul=ID2, Cavin=ID1, Akash=ID3, Vishwas=ID5, Shiva=ID4}
Sorted order by name:
Akash:ID3
Cavin:ID1
Rahul:ID2
Shiva:ID4
Vishwas:ID5
*/