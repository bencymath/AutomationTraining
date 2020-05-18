package utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class GenericUtilities {
	
	public static String getCurrentDate() {
		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy");  
		   LocalDateTime now = LocalDateTime.now();  
		   return (dtf.format(now));  
	}
	
	public static String getRandString() {
		String [] strArr= {"1","2","3","4","5","6","7","8","9","10"};
		Random rand=new Random();
		int strArrlength=rand.nextInt(strArr.length);
		return strArr[strArrlength];
		
	}
}

 
