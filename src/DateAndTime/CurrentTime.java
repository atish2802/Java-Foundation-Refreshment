package DateAndTime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CurrentTime {
	public static void main(String[] args) {
//		System.out.println(System.currentTimeMillis());
		
//		Date d = new Date();
//		System.out.println(d);
		
//		System.out.println(d.getTime());
//		System.out.println(d.getDate());
//		System.out.println(d.getYear());
//		System.out.println(d.getTimezoneOffset());
		
		
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getCalendarType());
		
		System.out.println(c.getTimeZone());
		
		
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.HOUR)+ ":"+ c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
		
		
		GregorianCalendar gc = new GregorianCalendar();
		
		System.out.println(gc.isLeapYear(2012));
		System.out.println(gc.getFirstDayOfWeek());
		System.out.println(gc.getWeeksInWeekYear());
		}
}
