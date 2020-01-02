package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class DBreader {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver not found:"+e.getMessage());
		}
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "hr";
		String password = "hr";
		Connection con = null;
		
		try {
				con = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			
			System.out.println("Connection failed"+e.getMessage());
		}
		
		try {
			DatabaseMetaData dbmeta = con.getMetaData();
			System.out.println(dbmeta.toString());
			System.out.println(dbmeta.getDatabaseProductName());
			System.out.println(dbmeta.getDatabaseMajorVersion());
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		String sql = "select first_name, last_name, employee_id from employees where last_name='King'";
		try {
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int type = rsmd.getColumnType(3);
			System.out.println(rsmd.getColumnTypeName(1));
			if(type == Types.INTEGER)
			{
				System.out.println("Col has integer type");
			}else if(type == Types.VARCHAR) {
				System.out.println("Col is a String(VARCHAR)");
			}else if(type == Types.NUMERIC) {
				System.out.println("Col is of type numeric");
			}
			System.out.println(rsmd.getColumnTypeName(3));
			
			while(rs.next()) {
				int id = rs.getInt(3); 
				String fname = rs.getString("first_name");
				String lname = rs.getString("last_name");
				System.out.println(id+":"+fname+":"+lname);
			}
			rs.close();
			st.close();
			con.close();
			
		} catch(SQLException sqle) {
			System.out.println(sqle.getMessage());
		}
	
		

	}

}
