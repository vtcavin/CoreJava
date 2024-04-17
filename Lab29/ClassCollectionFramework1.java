package Lab29;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
public class ClassCollectionFramework1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashSet<Integer>h1=new HashSet<>();
		System.out.println("Enter elements of Hashset1");
		String[] s1=sc.nextLine().split(" ");
		for(String obj:s1) {
		h1.add(Integer.parseInt(obj));
		}
		HashSet<Integer>h2=new HashSet<>();
		System.out.println("Enter elements of Hashset2: ");
		String[] s2=sc.nextLine().split(" ");
	
		for(String obj2:s2) {
		h2.add(Integer.parseInt(obj2));
		}
		//Tree set to print in sorted order
		System.out.println("Common elements in sorted order:");
		h1.retainAll(h2);
		TreeSet<Integer>h3=new TreeSet<>(h1);
		System.out.println(h3);
		sc.close();
	}	
}

/*
i/p: 1 2 3 4 5 6
2 4 5 9 10
o/p: 2 4 5
*/