package jdbc;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;



public class Date {

	public static void main(String[] args) {
		
			daysToDate("06-08-2020");
	}
	
	public static int daysToDate(String date) {
		int numdays= 0;
		
		
		LocalDate today = LocalDate.now();
		int thisyear = today.getYear();
		int thismonth = today.getMonthValue();
		int day = today.getDayOfMonth();
		System.out.println(thisyear+":"+thismonth+":"+day);
		
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate futureDate = LocalDate.from(dtf.parse(date));
		int futureyear = futureDate.getYear();
		int futuremonth = futureDate.getMonthValue();
		int futureday = futureDate.getDayOfMonth();
		
		System.out.println(futureyear+":"+futuremonth+":"+futureday);
		
		System.out.println("--------using chronounits---------");
		
		long daysBetween = ChronoUnit.DAYS.between(today, futureDate);
		System.out.println(daysBetween);
		
		return 0;
	
	}

}
