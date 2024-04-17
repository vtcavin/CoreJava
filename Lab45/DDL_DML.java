package Lab45;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class DDL_DML {
    public static void main(String[] args) {
    	String jdbcUrl ="jdbc:mysql://localhost:3306/StudentManagementSystem";
        String username ="root";
        String password ="3006";
        try (Connection con=DriverManager.getConnection(jdbcUrl, username, password);
             Statement st=con.createStatement()) {
        	String createTableSQL= "CREATE TABLE Users (id INT PRIMARY KEY, name VARCHAR(50))";
            st.execute(createTableSQL);
            System.out.println("Table created successfully");
            String alterTableSQL = "ALTER TABLE Users " + "ADD COLUMN email VARCHAR(50), " +"ADD COLUMN DateOfBirth DATE, " +
                                   "ADD COLUMN phone VARCHAR(20), " +
                                   "ADD COLUMN address VARCHAR(100)";
            st.execute(alterTableSQL);
            System.out.println("Table altered");

          
            int id = 7;
            String name = "Cavin";
            String email = "vtcavin@gmail.com";
            String DateOfBirth = "30-06-2001"; 
            String phone = "9502403197";
            String address = "Hyderabad";
            String insertDataSQL = "INSERT INTO Users (id, name, email, DateOfBirth, phone, address) " +
                    "VALUES ('" + id + "', '" + name + "', '" + email + "', '" + DateOfBirth + "', '" +
                    phone + "', '" + address + "')";
            int insRowsAffected = st.executeUpdate(insertDataSQL);
            if (insRowsAffected>0) {
                System.out.println("successfully");
            } else {
                System.out.println("Failed");
            }

            //update records
            String updateDataSQL= "UPDATE Users SET email = 'vadalacavin@gmail.com' WHERE id = 6";
            int updRowsAffected= st.executeUpdate(updateDataSQL);
            if (updRowsAffected>0) {
                System.out.println("Record updated successfully");
            } else {
                System.out.println("Failed to update record.");
            }
            String deleteDataSQL= "DELETE FROM Users WHERE id = 4";
            int delRowsAffected= st.executeUpdate(deleteDataSQL);
        		} catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

