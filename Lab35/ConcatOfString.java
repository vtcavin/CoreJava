package Lab35;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class ConcatOfString{
	void m1() {
		Stream<String>s1=Stream.empty();
		ArrayList<String> strlist = new ArrayList<>();
		//adding strings to array_list
        strlist.add("My ");
        strlist.add("name ");
        strlist.add("is ");
        strlist.add("cavin ");
        String concString=strlist.stream().collect(Collectors.joining()); 
       System.out.println("After Concatination of String");
       System.out.println(concString);

	}
	public static void main(String[] args) {
		ConcatOfString obj=new ConcatOfString();
		obj.m1();
	}
}

/*
Output:-
After Concatination of String
My name is cavin 

*/
