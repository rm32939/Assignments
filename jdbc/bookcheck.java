package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class bookcheck {
	
	Connection con = null;

	public static void main(String[] args) {
		bookcheck b = new bookcheck();
		b.listbooks();

	}
	
public void listafterx(int year) {
		
		DBConnector connector= new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr"); 
		con = connector.getConnection();
	}
	
	public void listbooks() {
		
		DBConnector connector= new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr"); 
		con = connector.getConnection();
		String sql = "select b.isbn,b.title,b.pages,b.pub_year,b.type,b.auth_id,b.pub_id,a.name,a.nationality,a.author_id,p.publisher_name,p.city,p.pub_id from book b join author a on b.auth_id=a.author_id join publisher p on b.pub_id=p.pub_id";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int isbn=rs.getInt(1);
				String title=rs.getString(2);
				int pages=rs.getInt(3);
				int year=rs.getInt(4);
				String type=rs.getString(5);
				int aid=rs.getInt(6);
				int pid=rs.getInt(7);
				String aname=rs.getString(8);
				String anational=rs.getString(9);
				int auid=rs.getInt(10);
				String pname=rs.getString(11);
				String city = rs.getString(12);
				int puid = rs.getInt(13);
				author a = new author(auid,aname,anational);
				Publisher p = new Publisher(puid,pname,city);
				Books u = new Books(isbn,title,pages,year,type,aid,pid,a,p);
				System.out.println(isbn+" : "+title+" : "+pages+" : "+year+" : "+type+" : "+aname+" : "+anational+" : "+pname+" : "+city);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	

}
