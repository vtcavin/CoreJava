package Lab10;

public class BreakContinue {
	
		void a1()
	    {
	    	System.out.println("Break");
	    	for(int i=1;i<=7;i++)
	    	{
	    		if(i==3)
	    		{
	    			break;
	    		}
	    		System.out.println(i);
	    	}
	   
	    }
	    void b1()
	    {
	    	System.out.println("Continue");
	    	for(int i=1;i<=9;i++)
	    	{
	    		if(i==4)
	    		{
	    			continue;
	    		}
	    		System.out.println(i);
	    	}
	    
	    }
	    void c1()
	    {
	    	 for(int i=1;i<4;i++)
	    	 {
	    		 for(int j=1;j<4;j++)
	    		 {
	    			 
	    			  if(i==1 && j==1)
	    			  {
	    				  break;
	    			  }
	    			  System.out.println(i+" "+j);
	    			  
	    		 }
	    		 
	    		 if(i==3)
	    		 {
	    			 continue;
	    		 }
	    		 System.out.println(i);
	    	 }
		    

	    }
		
	
	    public static void main(String[] args)
		{
			BreakContinue obj=new BreakContinue();
			obj.a1();
			obj.b1();
			obj.c1();
			
		}
	}



