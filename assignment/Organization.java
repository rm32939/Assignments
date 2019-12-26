package assignment;

public class Organization {
	
		static Employee[] emps= new Employee[5];

	public static void main(String[] args) {
			department hr=new department("hr","hyd");
			department dev=new department("dev","hyd");
			department test=new department("test","Delhi");
			
			address a1=new address("12E","Jcly","Hyd","Ts");
			Employee e1=new Employee("Ram",a1,1,dev);
			
			address a2=new address("12F","Jclk","nag","er");
			Employee e2=new Employee("Raj",a2,2,dev);
			
			address a3=new address("12G","Jclk","Hyd","rr");
			Employee e3=new Employee("Gaye",a3,3,hr);
			
			address a4=new address("12H","Jclm","Delhi","Tu");
			Employee e4=new Employee("Kiske",a4,4,dev);
			
			address a5=new address("12E","Jcly","Hyd","Ts");
			Employee e5=new Employee("Haath",a5,5,null);
			
			emps[0]=e1;
			emps[1]=e2;
			emps[2]=e3;
			emps[3]=e4;
			emps[4]=e5;
			
			//getdeptname("Ram");
			employeeno("dev");
			//nodept();
			
	}
	
	public static void getdeptname(String name)
	{
		
		for(int i=0;i<5;i++)
		{
			if((emps[i].name).equals(name))
               System.out.println(emps[i].getDept().getName());
		}
	}
	
	public static void employeeno(String Dept)
	{
		for(int i=0;i<5;i++)
		{
			if(emps[i].getDept()!= null)
			{
				if((emps[i].getDept().getName()).equals(Dept))
				{
					System.out.println(emps[i].getName());
				}
			}
		}
	}
	public static void nodept()
	{
		for(int i=0;i<5;i++)
		{
			if(emps[i].getDept() == null) {
				System.out.println(emps[i].getName());
			}
				
		}
	}
	
	
}
