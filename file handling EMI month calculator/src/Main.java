
import java.text.*;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.*;
class UserMainCode
{
	

	public static void displayDate(String i) throws Exception
	{
		
		SimpleDateFormat ob=new SimpleDateFormat("yyyy-MM-dd");
		//SimpleDateFormat ob1=new SimpleDateFormat("yyyy-MM-dd ");
		Date name=ob.parse(i);
		Calendar Cal=Calendar.getInstance();
		Cal.setTime(name);
		Cal.add(Cal.MONTH,-20);
		Date d=Cal.getTime();
		String s1=ob.format(d);
		//System.out.println(s1);
		
		System.out.println("20 months before "+i+" will be "+s1);
		
	}
	

}
public class Main {
	public static void main(String[] args) throws Exception
	{
	
	String s1,s2,s3;
	Scanner sc=new Scanner(System.in);
	//System.out.println("Enter the String");
	s1=sc.nextLine();
	//UserMainCode obj=new UserMainCode(s1);
	UserMainCode.displayDate(s1);
	//String start_dt = '2011-01-01';

	
	
}
}
