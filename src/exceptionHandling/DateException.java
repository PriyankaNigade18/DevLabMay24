package exceptionHandling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateException {

	public static void main(String[] args) throws ParseException 

	{

		
		String date="18/06/2024";
		
		SimpleDateFormat d=new SimpleDateFormat("yyyy/mm/dd",Locale.getDefault());
		Date dt=d.parse(date);
		System.out.println(date);
		System.out.println(dt);
		


		
	

	}

}
