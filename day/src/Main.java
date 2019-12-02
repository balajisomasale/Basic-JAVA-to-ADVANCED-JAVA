import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args)
	{
		
		String s[]={"Sun","Mon","Tue","Wen","Thu","Fri","Sat"};
		
		
		
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Enter the day number");
		x=sc.nextInt();
		
		System.out.println("Day of the week is "+s[x-1]);
		
		
		
	}
}
