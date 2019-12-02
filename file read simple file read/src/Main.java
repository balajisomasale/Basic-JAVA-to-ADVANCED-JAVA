import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) throws IOException
	{
	
		
		Scanner sc=new Scanner(System.in);
		//t=sc.nextInt();
		System.out.println("Enter the file name");
		FileReader fr=new FileReader(sc.nextLine());
		//BufferedReader br=new BufferedReader(fr);
		//System.out.println("player.txt");
		int i;
		while((i=fr.read())!=-1)  
		{
			
			System.out.print((char)i);
			
		}
		sc.close();
		fr.close();
		
		
		
		
		
	}
	
}



