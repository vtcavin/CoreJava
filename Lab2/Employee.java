package Lab2;

public class Employee {
	int id;
	int age;
	String name;
	boolean isPermanent;
	
	void show() {
		System.out.println("Id:  "+id);
		System.out.println("Age: "+age);
		System.out.println("Name: "+name);
		System.out.println("IsPermanent: "+isPermanent);
		System.out.println("Sucessfully Started");
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.id= 30;
		e.age= 22;
		e.name= "Cavin";
		e.isPermanent=true;
		e.show();
	}

}
