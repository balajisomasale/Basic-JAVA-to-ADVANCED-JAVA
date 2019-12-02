import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1,s2,s3,s4;
		System.out.println("Enter the content of the document");
		s1=sc.nextLine();
		 System.out.println("Enter the old name of the company");
		s2=sc.nextLine();
		System.out.println("Enter the new name of the company");
		s3=sc.nextLine();
		
		System.out.println("The content of the modified document is");
		
		System.out.println(s1.replace(s2,s3));
		
		
	}

		
}	
		
