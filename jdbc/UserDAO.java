package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserDAO {

	
	Connection con = null;
	private List<Users> a;
	public UserDAO() {a=new ArrayList<>();}
	
	
	public void listuserdetails() {
		
		DBConnector connector= new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr"); 
		con = connector.getConnection();
		String sql = "select u.userid22,u.usname22,u.u_name22,u.password22,u.emails22,r.role_id,r.rolename from users22 u join roles22 r on r.role_id=u.rid ";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery(sql);
			while(rs.next()) {
				//System.out.println(rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+":"+rs.getString(4)+":"+rs.getString(5)+":"+rs.getString(6)+":"+rs.getString(7));
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String usname = rs.getString(3);
				String password = rs.getString(4);
				String email = rs.getString(5);
				int roleid = rs.getInt(6);
				String rolename = rs.getString(7);
				Role r = new Role(roleid,rolename);
				Users u = new Users(id,name,usname,password,email,r);
				a.add(u);
				displayusers(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void displayusers(List a) {
		Iterator<Users> it = a.iterator();
		while(it.hasNext()) {
			Users u = it.next();
			System.out.println(u.getId()+":"+u.getName()+":"+"*******"+":"+u.getEmail()+":"+u.getRole().getRoleId()+":"+u.getRole().getRolename());
		}
	}
	
	public void printroll(String name) {
		Iterator<Users> itr = a.iterator();
		while(itr.hasNext()) {
			Users u = itr.next();
			if(u.getName().equals(name)) {
				System.out.println("Role name :"+u.getRole().getRolename());
			}
		}
	}
	
	public static void main(String[] args) {
	
			UserDAO u = new UserDAO();
			u.listuserdetails();
			u.printroll("ase");
		
	}

}
