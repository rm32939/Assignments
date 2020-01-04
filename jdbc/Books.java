package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Books {
	
	Connection con = null;
	private List<Users> a;
	public Books() {a=new ArrayList<>();}
	
	private int isbn;
	private String title;
	private int pages;
	private int year;
	private String type;
	private int auth_id;
	private int pub_id;
	private author auth;
	private Publisher pub;
	
	
	
	public Books( int isbn, String title, int pages, int year, String type, int auth_id, int pub_id,
			author auth, Publisher pub) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.pages = pages;
		this.year = year;
		this.type = type;
		this.auth_id = auth_id;
		this.pub_id = pub_id;
		this.auth = auth;
		this.pub = pub;
	}
	

	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPages() {
		return pages;
	}


	public void setPages(int pages) {
		this.pages = pages;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getAuth_id() {
		return auth_id;
	}


	public void setAuth_id(int auth_id) {
		this.auth_id = auth_id;
	}


	public int getPub_id() {
		return pub_id;
	}


	public void setPub_id(int pub_id) {
		this.pub_id = pub_id;
	}


	public author getAuth() {
		return auth;
	}


	public void setAuth(author auth) {
		this.auth = auth;
	}


	public Publisher getPub() {
		return pub;
	}


	public void setPub(Publisher pub) {
		this.pub = pub;
	}


	@Override
	public String toString() {
		return "Books [isbn=" + isbn + ", title=" + title + ", pages=" + pages + ", year=" + year + ", type=" + type
				+ ", auth_id=" + auth_id + ", pub_id=" + pub_id + ", auth=" + auth + ", pub=" + pub + "]";
	}


	public static void main(String[] args) {
			Books b = new Books();
			b.listbooks();
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
				System.out.println(isbn+" : "+title+" : "+pages+" : "+year+" : "+type+" : "+aname+" : "+anational+" : "+pname+" : "+city);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
