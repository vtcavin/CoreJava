package Lab20; 
	interface vertebrates {
	    void eat();
	    void sleep();
	}
	interface Bird {
	    void fly();
	    void sing();
	}
	class parrot implements vertebrates, Bird {
	   public void eat() {
	        System.out.println("parrot is eating");
	    }
	   public void sleep() {
	        System.out.println("parrot is sleeping");
	    }
	   public void fly() {
	        System.out.println("parrot is flying");
	    }
	   public void sing() {
	        System.out.println("parrot is singing");
	    }
	}
	public class Interface {
	    public static void main(String[] args) {
	        parrot parrot = new parrot();
	        parrot.eat();
	        parrot.sleep();
	        parrot.fly();
	        parrot.sing();
	    }
	}

