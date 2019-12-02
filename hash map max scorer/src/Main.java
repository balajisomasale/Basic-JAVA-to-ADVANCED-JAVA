import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		
		HashMap<String, Long> m = new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of players");
		int i=Integer.parseInt(sc.nextLine());
		for(int j=0;j<i;j++)
		{
			System.out.println("Enter the details of the player "+(j+1));
			String na;
			Long r;
			na=sc.nextLine();
			r=Long.parseLong(sc.nextLine());
			m.put(na,r);
		}
		Long ma=Collections.max(m.values());
		for(Map.Entry<String,Long> me: m.entrySet())
		{
			if(me.getValue()==ma)
			{
				System.out.println(me.getKey());
				break;
			}
			
		}
	}
}
