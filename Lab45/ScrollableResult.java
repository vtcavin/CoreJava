package Lab45;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ScrollableResult {
	public static void main(String[] args) {
		String jdbcUrl ="jdbc:mysql://localhost:3306/StudentManagementSystem";
		String username = "root";
        String password = "3006";
        //connection
        try(Connection con=DriverManager.getConnection(jdbcUrl,username, password);
        Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY)) 
       {
       String selectDataSQL = "SELECT StudentID, FirstName,LastName FROM student";
        ResultSet rs =stmt.executeQuery(selectDataSQL);
        rs.last();
        String lastId =rs.getString("StudentID");
        String fname =rs.getString("FirstName");
        String lname =rs.getString("LastName");
        System.out.println("Last Student ID: "+lastId +",Name:" +fname + " " +lname);
        rs.first();
        String firstId=rs.getString("StudentID");
        fname =rs.getString("FirstName");
        lname =rs.getString("LastName");
        System.out.println("First StudentID: " +firstId+ ", Name:" + fname + " " +lname);
        rs.absolute(2); 
        String absoluteId = rs.getString("StudentID");
        fname=rs.getString("FirstName");
        lname=rs.getString("LastName");
        System.out.println("Absolute Row - ID: "+absoluteId+", Name: "+fname+ " " +lname);
       }
        catch (SQLException e) {
        	e.printStackTrace();

	}
  }
}

