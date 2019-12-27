package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class MyDeque {
	
	
	
	public static void main(String[] args) {
		
		Deque <Integer> d = new ArrayDeque();
		d.add(1);
		d.add(3);
		d.add(4);
		d.addFirst(7);
		d.offerFirst(9);
		Iterator itr= d.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
