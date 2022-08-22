package Heart;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeYearCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d =new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyy mm:hh:ss");
		System.out.println(d.toString());
		System.out.println(format.format(d));
		calendar();
	}
	public static void calendar()
	{
		Calendar c=Calendar.getInstance();
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(c.get(Calendar.AM_PM));
		System.out.println(c.get(Calendar.MINUTE));
		
	}

}
