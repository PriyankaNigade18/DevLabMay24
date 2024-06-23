package sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.Week2.AccessModifier;

//import com.Week2.*;
//import com.Week2.AccessModifier;
public class Modifiers {

	public static void main(String[] args) throws ParseException 
	{
		//different class and different package
		AccessModifier a1=new AccessModifier();
		System.out.println(a1.name);

		String d="2018-11-11";
		//SimpleDateFormat dd = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
		SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
		Date date =dd.parse(d);
		
		
	}

}
