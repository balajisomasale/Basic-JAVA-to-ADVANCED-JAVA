
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException
	{
	
		String s1,s2,s3;
		Scanner sc=new Scanner(System.in);
		//t=sc.nextInt();
		
		
		FileWriter fr=new FileWriter("user.csv");
		System.out.println("Enter the name of the player");
		s1=sc.nextLine();
		
		System.out.println("Enter the team name");
		s2=sc.nextLine();
		System.out.println("Enter the number of matches played");
		s3=sc.nextLine();
		fr.write(s1+","+s2+","+s3);
		fr.flush();
		sc.close();
		//BufferedReader br=new BufferedReader(fr);
		//System.out.println("player.txt");
		
		fr.close();
		
		
		
		
		
	}
}
