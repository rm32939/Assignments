package assessment1;

public class department {
	
	
	private String dept;
	private String location;
	
	

	public department(String dept, String location) {
		super();
		this.dept = dept;
		this.location = location;
	}
	
	


	public String getDept() {
		return dept;
	}




	public void setDept(String dept) {
		this.dept = dept;
	}




	public String getLocation() {
		return location;
	}




	public void setLocation(String location) {
		this.location = location;
	}




	@Override
	public String toString() {
		return "department [dept=" + dept + ", location=" + location + "]";
	}


}
