package secao11.application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarOld {
	
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2024-12-21T09:50:00Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();		
		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);
		int mounth = 1 + cal.get(Calendar.MONTH);

		System.out.println("Minutes: " + minutes);
		System.out.println("Mouth: " + mounth);
		
		
		
	}

}
