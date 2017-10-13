import java.sql.*;
import java.io.*;
import oracle.jdbc.*;

public class SQLClass {

	public static void addCustomer(int custID, String fName, String lName, String address, 
			String state, String city, int zip) throws SQLException{
		String sql = "INSERT INTO CUSTOMER VALUES (?,?,?,?,?,?,?)";
		
		try{
			Connection conn = DriverManager.getConnection("");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custID);
			pstmt.setString(2, fName);
			pstmt.setString(3, lName);
			pstmt.setString(4, address);
			pstmt.setString(5, state);
			pstmt.setString(6, city);
			pstmt.setInt(7, zip);
			pstmt.executeUpdate();
			pstmt.close();
		}
		catch(SQLException e){
			System.err.println();
		}
	}
}
