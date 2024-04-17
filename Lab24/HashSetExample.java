package Lab24;
import java.util.HashSet;
public class HashSetExample {
	public static void main(String[] args){
		HashSet<Integer> numberSet=new HashSet<>();
		numberSet.add(5);
        numberSet.add(10);
        numberSet.add(15);
        numberSet.add(20);
        numberSet.add(25);
        System.out.println("Elements of the set are: " + numberSet);
        if(numberSet.contains(10)){
            System.out.println("The set contains 10");
        }
        else{
            System.out.println("The set does not contain 10");
        }
        numberSet.remove(15);
        System.out.println("Size of the set is: "+numberSet.size());
    }
}


