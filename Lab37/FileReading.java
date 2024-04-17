package Lab37;
import java.io.FileInputStream;
import java.io.IOException;
public class FileReading {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\Hp\\Cavin\\Desktop\\introduction.txt");
		int character;
        int totalCount = 0;
        //read characters from the file
        while ((character =fis.read())!= -1) {
        	char ch = (char)character;
        	System.out.print(ch);
            totalCount++; //count
        }
    	System.out.println();
    	//closing the file
		fis.close();
        System.out.println("Total number of characters: "+totalCount);
		
	}
}