package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyMap {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		
		map.put(1, "laptop");
		map.put(2, "mobile");
		map.put(3, "keyboard");
		map.put(4, "mouse");
		map.put(5, "tablet");
		
		String device = map.get(3);
		System.out.println(device);
		
		Set<Integer> set = map.keySet();
		
		Iterator<Integer> It = set.iterator();
		while(It.hasNext()) {
			Integer st = It.next();
			String value = map.get(st);
			System.out.println(st+" : "+value);
		}
		
		Map<Integer, String> map1 = new HashMap<>();
		
		map1.put(1, "Ram");
		map1.put(2, "Raj");
		map1.put(3, "Asif");
		map1.put(4, "Isha");
		
		String name = getStudentName(123);
		System.out.println(name);
	}
	
	
	/*public static String getname(Map m, int r) {
		

		Iterator<Integer> It = set.iterator();
		while(It.hasNext()) {
			Integer st = It.next();
			String value = map.get(st);
			System.out.println(st+" : "+value);
		}
		
	}*/
	
	
	
	public static String getStudentName(int rollNum) {
		Map<Integer, Student> map = getStudentMap();
		if(map.containsKey(rollNum)) {
			Student st = map.get(rollNum);
			
			return st.getName();
		}
		return null;
	}
	public static Map getStudentMap() {
		Map<Integer, Student> stds = new HashMap<>();
		List<Student> list = new ArrayList<>();
		Student akash = new Student("Akash",123);
		Student Kalpana = new Student("Kalpana",345);
		Student Sasha = new Student("Sasha",876);
		Student Prakash = new Student("Prakah",567);
		
		list.add(akash);
		list.add(Sasha);
		list.add(Kalpana);
		list.add(Prakash);
		Iterator<Student> its = list.iterator();
		while(its.hasNext()) {
			Student st = its.next();
			stds.put(st.getRoll(), st);
		}
		return stds;
		
		
		
	}

}
