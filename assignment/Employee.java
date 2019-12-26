package assignment;

public class Employee extends Person{
	
	protected int empid;
	protected String dept;
	private department Dept;
	
	public Employee(String name, int empid) {
		super(name);
		this.empid=empid;
	}
	

	public Employee(String name, address addr, int empid, department Dept )
	{
		super(name,addr);
		this.empid=empid;
		this.Dept=Dept;
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

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", dept=" + dept + "]";
	}
	

}
