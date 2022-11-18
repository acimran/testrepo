import java.sql.*;  
public class emp_operations {

 Statement stmt;
	  String q1;
	 Connection con;
	 ResultSet rs;
	 int x;
	 
	 // Method to create connection 
	 public void create_connection() throws SQLException, ClassNotFoundException {
		 
		 Class.forName("com.mysql.jdbc.Driver");  
		  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","Welcome@123");  
	 
		
		
	
			
		 
	 }
	 
	 // Method to insert data 
	 
	 public void add_employee() throws SQLException {
			
			// insert into table 
			 stmt=con.createStatement();  
		        q1 = "insert into employee values('1', ' +pwd+ ', ' +fullname+ ', ' +email+ ','phone','can')";
		    	       x = stmt.executeUpdate(q1);
		      
		      System.out.println(x);
			 
			
			//stmt.executeQuery("insert into employee values(333,'nayeem','sagar','singapore','ceo')");
			
			 rs=stmt.executeQuery("select * from employee");  
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(3)+"  "+rs.getString(4)+" "+rs.getString(5));  
			
			
	 }
 public void update_employee() throws SQLException {
	// update the record 
		  stmt=con.createStatement();  
		     q1 = "update employee set city ='monaco' where employeeid =1";
		    	  int    x = stmt.executeUpdate(q1);
		      
		      System.out.println(x);
			 System.out.println("after the update of table");
			
			//stmt.executeQuery("insert into employee values(333,'nayeem','sagar','singapore','ceo')");
			
			 rs=stmt.executeQuery("select * from employee");  
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(3)+"  "+rs.getString(4)+" "+rs.getString(5));  
			
			
	 }
 public void del_employee() throws SQLException {
		//delete added record
		
		
		q1="delete from employee where employeeid=1";
		
		x = stmt.executeUpdate(q1);
	      
	      System.out.println(x);
		
	      
	      System.out.println("deletion of the record");
	     rs=stmt.executeQuery("select * from employee");  
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(3)+"  "+rs.getString(4)+" "+rs.getString(5));  
			
 }
 
	public static void main(String args[]) throws SQLException, ClassNotFoundException{  
		 
		
		  emp_operations a=new emp_operations();
		  a.create_connection();
		  System.out.println("**********************************************************");
		  a.add_employee();
		  System.out.println("**********************************************************");

		  a.update_employee();
		  System.out.println("**********************************************************");

		  a.del_employee();
		  System.out.println("**********************************************************");

		  
	
		
		
	
			
			 
		 
		}  

}
