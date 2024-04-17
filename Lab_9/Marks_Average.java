package Lab_9;
import java.util.Scanner;
public class Marks_Average {
public static void main(String[] args) {
        //Input of 5 subjects marks from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of CoreJava: ");
        int sub1=sc.nextInt();
        System.out.println("Enter marks of SQL: ");
        int sub2=sc.nextInt();
        System.out.println("Enter marks of HTML: ");
        int sub3=sc.nextInt();
        System.out.println("Enter marks of JAVASCRIPT: ");
        int sub4=sc.nextInt();
        System.out.println("Enter marks of REACT: ");
        int sub5=sc.nextInt();
        //total marks
        int totalMarks =sub1+sub2+sub3+sub4+sub5;
        //average marks
        double avgMarks=totalMarks/5;
        String grade;
        if (avgMarks>90) {
            grade="Excellent";
        } 
        else if (avgMarks>80) {
            grade="A";
        } 
        else if (avgMarks>60) {
            grade="B";
        } 
        else if (avgMarks>=40) {
            grade="C";
        } 
        else{
            grade="F";
        }
                
        System.out.println("Total marks: " +totalMarks);
        System.out.println("Average marks: " +avgMarks);
        System.out.println("Grade: " +grade);

        

    }
}

/*
 Output:-
 Enter marks of CoreJava: 
92
Enter marks of SQL: 
81
Enter marks of HTML: 
75
Enter marks of JAVASCRIPT: 
53
Enter marks of REACT: 
34
Total marks: 335
Average marks: 67.0
Grade: B

Enter marks of CoreJava: 
84
Enter marks of SQL: 
79
Enter marks of HTML: 
87
Enter marks of JAVASCRIPT: 
65
Enter marks of REACT: 
89
Total marks: 404
Average marks: 80.0
Grade: B


*/

