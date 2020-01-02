package jdbc;

import java.util.Date;
import java.util.Calendar;

public class MyCalendar {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		int yr = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		
		System.out.println(day+":"+(mon+1)+":"+yr);
		Date dt = new Date();
		long millis = dt.getTime();
		Calendar clndr = Calendar.getInstance();
		clndr.setTime(dt);
		clndr.setTimeInMillis(millis);
	}

}
