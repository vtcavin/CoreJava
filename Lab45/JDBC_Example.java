package Lab45;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBC_Example {
	public static void main (String[] args) {
		Connection con=null; 
		Statement st=null;   
		ResultSet rs=null;
		try {
		    //1.loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");  
			//2.create connection
			String url="jdbc:mysql://localhost:3306/studentmanagementsystem";
			String username="root";
			String password="3006";
			con=DriverManager.getConnection(url,username,password);
			//3.create statement
			String sqlQuery ="SELECT * FROM student";
			st=con.createStatement();
			//4.execute statement
			rs=st.executeQuery(sqlQuery);
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
				System.out.println(rs.getString(6));
				System.out.println(rs.getString(7));
			}
			
		}
		//5.Handling Exceptions
		catch(ClassNotFoundException | SQLException e1){
			e1.printStackTrace();
		}
		finally {
			try {
			    //6.close connections
				con.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	
}
