package compare;

public class EmployeeTest {
	
	public static void main(String[] args) {
		Employee e1= new Employee("akhil b",123);
		Employee e2= new Employee("akhil b",127);
		
		System.out.println(e1.equals(e2));
	}

}
