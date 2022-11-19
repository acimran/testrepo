package test_java_project;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try	{	
		 int data=25/0;  
		   System.out.println(data);  
		}catch(Exception e) {
			System.out.println("Exception is"+e);
		}
		 finally
		  {
			  System.out.println("finally block is always execute - risk is overd");
		  }  
		
		   
		   System.out.println("hello world");

		 
	}

}
