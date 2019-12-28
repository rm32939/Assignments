package assessment1;


public class main {
	
	static Employee[] emps = new Employee[5];
	
	public static void main(String[] args) {
		
		department hr=new department("hr","hyd");
		department dev=new department("dev","Bangalore");
		department test=new department("test","Delhi");
		
		
		
		Employee e1=new Employee("Ram",123,dev,"Manager", 500000, " " );
		
		Employee e2=new Employee("Raj",456,dev,"Developer",300000,"Ram");
		
		Employee e3=new Employee("Gaye",789,hr,"tester",300450,"Haath");
		
		Employee e4=new Employee("Kiske",112,dev,"Developer",400000,"Ram");
		
		Employee e5=new Employee("Haath",577,test,"Manager",600000," ");
		
		emps[0]=e1;
		emps[1]=e2;
		emps[2]=e3;
		emps[3]=e4;
		emps[4]=e5;
		
		listdata();
		listroll("Manager");
		listemployeemanager("Ram");
		listemployeedept(dev);
		incrementsal("tester",50);
	}
	
	public static void listdata()
	{
		System.out.println("Employee Information");
		for(int i=0;i<5;i++)
		{
			System.out.println(emps[i]);
		}
	}
	
	public static void listroll(String ro)
	{
		System.out.println("The list of roll numbers are: ");
		for(int i=0;i<5;i++)
		{
			if(emps[i].getRo().equals(ro)) {
				System.out.println(emps[i].getName());
			}
		}
	}
	
	public static void listemployeemanager(String m) {
		
		for(int i=0;i<5;i++) {
			if(emps[i].getManager().equals(m)) {
				System.out.println(emps[i].getName());
			}
		}
	}
	
	public static void listemployeedept(department d) {
		
		System.out.println("Department: ");
		for(int i=0;i<5;i++)
		{
			if(emps[i].getDept().equals(d)) {
				System.out.println(emps[i].getName());
			}
		}
	}
	
	public static void incrementsal(String r,float p) {
		System.out.println("Salary: ");
		for(int i=0;i<5;i++)
		{
			if(emps[i].getRo().equals(r)) {
				double v=emps[i].getSalary();
				v = v + v*(p/100);
				emps[i].setSalary(v);
				System.out.println(emps[i].getName()+":"+emps[i].getSalary());
				
			}
			
		}
	}
	
	
	

}
