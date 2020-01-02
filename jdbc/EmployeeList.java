package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeList {
	
	Connection con = null;
	
	public void listEmployeesByDept(String deptName) {
		
		DBConnector connector= new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr"); 
		con = connector.getConnection();
		String sql = "select * from employees where department_id = (select department_id from departments where department_name='"+deptName+"')";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void listEmployeesByDept(int dept) {
		DBConnector connector= new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr"); 
		con = connector.getConnection();
		//String sql = "select * from employees where department_id="+dept;
		String sql = "select * from employees where department_id=?";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, dept);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		EmployeeList list = new EmployeeList();
		list.listEmployeesByDept(90);
		//list.listEmployeesByDept("Executive");
		

	}

}
