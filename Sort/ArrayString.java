package Sort;

import java.util.Arrays;
import java.util.Comparator;

import compare.Employee;
public class ArrayString {

	public static void main(String[] args) {

			
		Arrays.sort(args);
		for(String s: args) {
			System.out.println(s);
			
		}
		
		Employee e1= new Employee("ankit",123,40000L);
		Employee e2= new Employee("rahul",026,32450L);
		Employee e3= new Employee("ram", 432,567800L);
		Employee e4= new Employee("bay",322,41000L);
		Employee emps[]= new Employee[4];
		emps[0]=e1;
		emps[1]=e2;
		emps[2]=e3;
		emps[3]=e4;
		Arrays.sort(emps, new Comparator<Employee>() { //first argument will be a collection array and the second one being a comparator 

			@Override
			public int compare(Employee o1, Employee o2) {
				//return o1.getName().compareToIgnoreCase(o2.getName());
				//return o1.getId() - o2.getId();
				double c;
				c = o1.getSalary()-o2.getSalary();
				return (int)c;
			}
				
		});
		
		for(Employee e : emps) {
			System.out.println(e);
		}
		//Sortstring(names);
	}
	
	
	
	/*public static void Sortstring(String sort[])
	{
		int size=sort.length;
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<sort.length;j++)
			{
				if(sort[i].compareTo(sort[j])>0) {
					
					String temp= sort[i];
					sort[i]=sort[j];
					sort[j]= temp;
				}
			}
		}
		System.out.println(Arrays.toString(sort));
		
	}*/

}
