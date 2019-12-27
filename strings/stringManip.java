package strings;

import java.util.HashSet;
import java.util.Set;

public class stringManip {

	
	public static void main(String[] args) {
		String str = new String();
		str = "This is a text";
		String st = new String("this a new line of text in a paragraph");
		
		System.out.println(str==st);
		System.out.println(str.equals(st));
		
		str=st;
		System.out.println(str==st);
		System.out.println(str.equals(st));
		
		int len = str.length();
		
		int indexOfC = str.indexOf('t');
		System.out.println(indexOfC);
		
		int lastIndexOft = str.lastIndexOf('t');
		System.out.println(lastIndexOft);
		int count=0;
		for(char c : str.toCharArray()) {
			if(c=='t')
				count++;
		}
		
		System.out.println(count);
		int f1=0,f2=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)=='t')
			{
				if(str.charAt(i+1)=='e'&& i<str.length())
				{
					f1=i;
					f2=i+4;
				}
				
			}
		}
		
		System.out.println(str.subSequence(f1, f2));
		
		locate("text", str);
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("html");
		buffer.append("<head><title> My webpage </title></head>");
		buffer.append("<body>");
		buffer.append("<h1> This is my web profile</h1>");
		buffer.append("</body></html>");
		
		System.out.println(buffer.toString());
		
		System.out.println(palindrome("madam"));
		
		int c = alphabetnumber("The quick brown fox jumps over a lazy dog");
		System.out.println(c);
		
	}
	
	public static boolean palindrome(String text)
	{
		StringBuffer Bu = new StringBuffer(text);
		Bu=Bu.reverse();
		return text.equals(Bu.toString());
		
		
	}
	
	public static int alphabetnumber(String text)
	{
		Set<Character> texts = new HashSet();
		for(int i=0;i<text.length();i++)
		{
			texts.add(text.charAt(i));
		}
		
		return texts.size()-1;
	}
	
	public static void locate(String word, String line)
	{
		if(line.contains(word)) {
			int start = line.indexOf(word);
			int end = start+ word.length();
			
			System.out.println(line.subSequence(start, end));
		}
	}
	
}
