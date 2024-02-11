package JDBCemployee;

import java.sql.*;

public class JDBCmySQL {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:mysql://localhost:3306/test";
		String uname = "root";
		String pass = "Connect2023";
		String query = "select * from Employees";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);

			rs.next();
			String First = rs.getString(2) + " " + rs.getString(3);
			System.out.println(First);
			rs.next();
			String Second = rs.getString(2) + " " + rs.getString(3);
			System.out.println(Second);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // class for name
 
	}
}