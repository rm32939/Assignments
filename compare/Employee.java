package compare;

public class Employee {
	
	private String name;
	private int id;

	
	
	
	
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	@Override
	public boolean equals(Object other) {
		Employee e = (Employee)other; //default object is casted to employee type object
		return this.id == e.id; 
	}
	
	@Override
	public int hashCode() {
		return id/12;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub



}	

}
