package OtherEasyOne;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToStrng {
	public static void main(String args[]) {
		
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("YY-MM-DD HH:MM:SS");
		String strDate = dateFormat.format(date);
		System.out.println("The Current Date:" +strDate);
	
	}

}
