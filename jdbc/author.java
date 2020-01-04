package jdbc;

public class author {
	
	private int authorid;
	private String authorname;
	private String nationality;
	public author(int authorid, String authorname, String nationality) {
		super();
		this.authorid = authorid;
		this.authorname = authorname;
		this.nationality = nationality;
	}
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	@Override
	public String toString() {
		return "author [authorid=" + authorid + ", authorname=" + authorname + ", nationality=" + nationality + "]";
	}	
	
}
