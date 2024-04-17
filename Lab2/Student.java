package Lab2;

public class Student {
	
	private String studentName;
	private static String collegeName;
	private int studentId;
	
	private void show() {
		System.out.println("Student Name: "+ studentName);
		System.out.println("Student Id: "+ studentId);
		System.out.println("College Name: "+ collegeName);
		System.out.println("Successful completed");
		
	}
	 public static void main(String[] args) {
		 Student s =new Student();
		 s.studentName="Cavin";
		 s.studentId=30;
		 Student.collegeName="SNIST";
		 s.show();
	 }

}
