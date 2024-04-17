package Lab20;

public class cat extends Animal {
	void makeSound(){
		System.out.println("Cat meows");
	}
	public static void main(String[] args) {
		Animal a = new cat();  
		a.makeSound();
	}
	
}

