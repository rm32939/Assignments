package handson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordMap {
	
	public static void main (String[] args)
	{
		List<String> word = new ArrayList<>();
		getWord(word);
		System.out.println(word);
		
		Map<String, Integer> map = addWord(word);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word to print vowel");
		String str = sc.nextLine();
		System.out.println(getvowel(map,str));
	}
	
	public static void getWord(List a)
	{
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter word and press 1 to exit");
				String str= s.nextLine();
				if(str.equals("1")) {
					break;
				}
				else
					a.add(str);
			
		}
	}
	
	public static Map<String, Integer> addWord(List<String> l){
		
		Iterator itr= l.iterator();
		Map<String, Integer> m = new HashMap(); 
		while(itr.hasNext())
		{         
			int count=0;
			String str;
			str= itr.next().toString().toLowerCase();
			
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
					
					count++;
				}
			}
			m.put(str,count);
			
		}
		
		return m;
		
		
	}
	
	public static int getvowel(Map<String, Integer> m, String s) {
		if(m.containsKey(s))
			return m.get(s);
		else
			return -1;
	}

}
