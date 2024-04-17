package Lab10;

public class Patterns {

	void a() {
		int rows=5;
		int i, j;       
		for (i=0; i<rows; i++) {  
		     for (j=2*(rows-i); j>=0; j--) {        
		    	 System.out.print(" ");   
		}   
		for (j=0; j<=i; j++ ) { 
		    	 System.out.print(" * ");   
		}
		     	System.out.println(); 
        } 
     }
		void b() {
           int k = 1;
	       int row = 4;
	       for(int j = 0; j < row; j++) {
	          for(int i = row- 1; i > j; i--) {
	              System.out.print(" ");
	          }
	          for(int i = 0; i < k; i++) {
	              System.out.print("*");
	          }k= k+2;
	          System.out.println();
	       }
		
	}
	public static void main(String[] args) {

		Patterns ps= new Patterns();
		ps.a();
		ps.b();
	
}

}

