package DateAndTime;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI {
	 public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy");
		String s = dt.format(df);
		System.out.println(s);
	
	 }
}
