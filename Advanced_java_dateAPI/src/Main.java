import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		
		//SimpleDateFormat d=new SimpleDateFormat("dd/mm/yyyy");
	
		Scanner sc=new Scanner(System.in);
		String date=sc.nextLine();
		sc.close();
		
		DateTimeFormatter d2=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d1=LocalDate.parse(date,d2);
		System.out.println(d1);
		
	}
}

