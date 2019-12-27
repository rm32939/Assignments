package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class MyCollections {

	public static void main(String[] args) {
		
		Vector<String> v =new Vector(); 
		v.add("ankit");
		v.add("Computer");
		v.add("Laptop");
		v.add("Kabir");
		
		System.out.println(v.size());
		
		/*for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}*/
		
		for(String s: v) {   //enhanced for loop
			System.out.println(s);
		}
		
		Enumeration<String> E = v.elements();  //enumerator method
		while(E.hasMoreElements()) {
			System.out.println(E.nextElement());
		}
		
		
		Iterator<String> it = v.iterator();   //iterator method - most preferred way
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(12);
		list.add(51);
		list.add(43);
		int tot=0;
		
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext())
		{
			tot+=iter.next();
		}
		System.out.println("Sum: "+tot);

		Collections.sort(list);
		System.out.println(list);
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("nina",321));
		students.add(new Student("asha",123));
		students.add(new Student("aria",435));
		students.add(new Student("samir",121));
		
		Iterator<Student> sdIt = students.iterator();
		while(sdIt.hasNext()) {
			Student st = sdIt.next();
			System.out.println(st.getName());
		}
		
		Collections.sort(students, new Comparator<Student>() { //sorting according to names

			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
						
						
			}
			
		});
		
		//System.out.println(students);
		
		Collections.sort(students, new Comparator<Student>() {   //sorting according to roll numbers

			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.getRoll()-o2.getRoll();
			}
			
		});
		
		System.out.println(students);
		
		Collections.sort(students, new StudentNameSorter());
		System.out.println(students);
		
		filter(students); //method to filter students whose name start with a
		
		int roll=returnroll(students, "anu");
		if(roll!=0) {
			System.out.println("Roll is: "+roll);
		}
		else
		{
			System.out.println("Student doesn't exist ");
		}
	}
	
	public static void filter(List<Student> a) {
			
		Iterator<Student> sdIt = a.iterator();
		while(sdIt.hasNext()) {
			Student st = sdIt.next();
			if(st.getName().charAt(0)== 'a') {
				
				System.out.println(st);
			}
		}	
	}
	
	
	public static int returnroll(List<Student> s, String name) { //method to return roll no. if student exists
		
		Iterator<Student> sdIt = s.iterator();
		while(sdIt.hasNext()) {
			Student st = sdIt.next();
			if(st.getName().equalsIgnoreCase(name)) {
				
				return st.getRoll();
			}
			
		}
		return 0;
	}

	
}
