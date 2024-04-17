package Lab23;
import java.util.ArrayList;
public class Sum_ArrayList {
	void a1() {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(5);
	    numbers.add(6);
	    numbers.add(7);
	    numbers.add(8);
	    numbers.add(9);
	    numbers.add(10);
	    int sum=0;
	    for(int n:numbers){
	    	if (n%2==0){
	    		sum=sum+n;
	        }
	    }
	    System.out.println("Sum of even numbers in the array list is "+sum);

	}
	public static void main(String[] args){
	    	Sum_ArrayList obj=new Sum_ArrayList();
	    	obj.a1();
	}
	}

