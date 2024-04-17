package Lab35;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class RemoveDuplicates {
	void m1() {
		
		//creating a new stream Api
		Stream<String>s1=Stream.empty();
		//creating a new arraylist
        ArrayList<String> slist = new ArrayList<>();
       slist.add("java");
       slist.add("python");
       slist.add("sql");
       slist.add("html");
       slist.add("css");
       slist.add("html");
       slist.add("python");
       slist.add("java");
       List<String> newStrings=slist.stream().distinct().collect(Collectors.toList());
       System.out.println("Duplicates removed: ");
       newStrings.stream().forEach(System.out::println);

	}
	
	public static void main(String[] args) {
		
		RemoveDuplicates obj=new RemoveDuplicates();
		obj.m1();
	}
	
}

/*
Output:-
Duplicates removed: 
java
python
sql
html
css
*/