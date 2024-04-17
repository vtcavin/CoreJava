package Lab11;
public class ClassCharacterMethods {
	static void characterMethods()
	{
	
		System.out.println("isLetter() method");
		char ch1='v';
		System.out.println(Character.isLetter(ch1));
		
		System.out.println("isDigit() method");
		char ch2='6';
		System.out.println(Character.isDigit(ch2));
		
		System.out.println("isWhitespace() method");
		char ch3=' ';
		System.out.println(Character.isWhitespace(ch3));
		
		System.out.println("isUpperCase() method");
		char ch4='t';
		System.out.println(Character.isUpperCase(ch4));
		
		System.out.println("isLowerCase() method");
		char ch5='c';
		System.out.println(Character.isLowerCase(ch5));
		
		System.out.println("toUpperCase() method");
		char ch6='c';
		System.out.println(Character.toUpperCase(ch6));
		
		System.out.println("toLowerCase() method");
		char ch7='G';
		System.out.println(Character.toLowerCase(ch7));

	}
	
	public static void main(String[] args)
	{
		ClassCharacterMethods.characterMethods();
	}
	

}


