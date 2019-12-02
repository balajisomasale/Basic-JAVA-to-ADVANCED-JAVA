
import java.text.*;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.*;
class UserMainCode
{
	

	public static void displayDate(String i) throws Exception
	{
		
		SimpleDateFormat ob=new SimpleDateFormat("MMM dd,yyyy");
		SimpleDateFormat ob1=new SimpleDateFormat("yyyy-MM-dd");
		Date name=ob.parse(i);
		String s1=ob1.format(name);
		System.out.println(s1);
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
