package Lab20;
public class dog extends cat{
	void makeSound(){
		System.out.println("Dog barks");
	}
	public static void main(String[] args) {
		cat a = new dog();  
		a.makeSound();
	}
}

