package Lab36;
interface ArithmeticOperations {
	public double op(double a, double b);
 }
public class LamdaOperator {
	public static void main(String[] args) {
		System.out.println("Arithemetic operations of a1 and a2 are:");
		
		//lambda expression for addition
		
		ArithmeticOperations add =(double a1,double a2)-> a1+a2; 
		System.out.println("Addition: "+add.op(57,27));
		
		//lambda expression for subtraction
		
		ArithmeticOperations sub =(double a1,double a2)-> a1-a2; 
		System.out.println("Subtraction: "+sub.op(57,27));
		
		//lambda expression for multiplication
		
		ArithmeticOperations mul =(double a1,double a2)-> a1*a2; 
		System.out.println("Multiplication: "+mul.op(57,27));
		
		//lambda expression for division
		
		ArithmeticOperations divide=(double a1,double a2)-> a1/a2; 
		System.out.println("Division: "+divide.op(57,27));

		
		
	}

}

/*
Output:-
Arithemetic operations of a1 and a2 are:
Addition: 84.0
Subtraction: 30.0
Multiplication: 1539.0
Division: 2.111111111111111

 */


