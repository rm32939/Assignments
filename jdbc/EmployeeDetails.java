package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeDetails {
	
	Connection con = null;
	List<ResultSet> res;
	public EmployeeDetails() {
		res = new ArrayList();
	}
	
public void listEmployeesBeforedate(String date) {
		DBConnector connector= new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr"); 
		con = connector.getConnection();
		String sql = "select emp_id,first_name,last_name,salary,department_id,to_char(hire_date,'DD-MON-YYYY') from employees where hire_date<'"+date+"'";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery(sql);
			int count=0;
			while(rs.next()) {
				res.add(rs);
				int id = rs.getInt(1);
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				double salary = rs.getDouble(4);
				int deptID = rs.getInt(5);
				String jdate = rs.getString(6);
				SimpleDateFormat sdf = new SimpleDateFormat("DD-MMM-YYYY");
				Date joinDate = null;
				try {
						joinDate = sdf.parse(jdate);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				Employee e = new Employee(id,fname+" "+lname,deptID,joinDate,salary);
				
				System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4)+":"+rs.getString(5)+":"+rs.getString(6));
				count++;
			}
			System.out.println(count);
			System.out.println(res.size());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		EmployeeDetails list = new EmployeeDetails();
		list.listEmployeesBeforedate("01-JAN-2010");
		

	}

}
