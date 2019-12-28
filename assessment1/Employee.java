package assessment1;


public class Employee {
	
	private String name;
	private int empid;
	private department Dept;
	private String ro;
	private double salary;
	private String Manager;
	public Employee(String name, int empid, department dept, String ro, double salary, String manager) {
		super();
		this.name = name;
		this.empid = empid;
		Dept = dept;
		this.ro = ro;
		this.salary = salary;
		Manager = manager;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public department getDept() {
		return Dept;
	}
	public void setDept(department dept) {
		Dept = dept;
	}
	public String getRo() {
		return ro;
	}
	public void setRo(String ro) {
		this.ro = ro;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getManager() {
		return Manager;
	}
	public void setManager(String manager) {
		Manager = manager;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", Dept=" + Dept + ", ro=" + ro + ", salary=" + salary
				+ ", Manager=" + Manager + "]";
	}
		
	

}
