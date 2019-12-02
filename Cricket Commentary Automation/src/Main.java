import java.lang.Math.*;
import java.util.Scanner;


class Delivery
{
	
	 void displayDeliveryDetails(String bowler, String batsman)
	{
		int i,j;
		String bo,ba;
		i=bowler.lastIndexOf(" ");
		j=batsman.lastIndexOf(" ");
		bo=bowler.substring(i+1);
		ba=batsman.substring(j+1);
		
		System.out.println("Player details of the delivery:");
		System.out.println("Bowler:"+bo);
		System.out.println("Batsman:"+ba);
		
		
		
	}

	 void displayDeliveryDetails(Long runs)
	{
		if(runs==6)
		{
			
			
			
			System.out.println("Number of runs scored in the delivery : 6");
			
			
			
			
			System.out.println("It is a Sixer.");
		
			
		}
		
		else if(runs==4)
		{
			
			
			System.out.println("Number of runs scored in the delivery : 4");
			
			
			
			
			System.out.println("It is a boundary.");
			
		}
		else
			
			System.out.println("Number of runs scored in the delivery : "+runs);
	}
	
}



public class Main {
public static void main(String[] args)
{
	int i;
	long j;
	Scanner sc=new Scanner(System.in);
	System.out.println("Menu\n1.Player details of the delivery\n2.Run details of the delivery");
	i=sc.nextInt();
	sc.nextLine();
	
	
	if(i==1)
	{
		String bo,ba;
		System.out.println("Enter the bowler name\n");
		bo=sc.nextLine();
		System.out.println("Enter the batsman name\n");
		ba=sc.nextLine();
		Delivery d=new Delivery();
		d.displayDeliveryDetails(bo,ba);
	}

	else {
	
		System.out.println("Enter the number of runs");
		j=sc.nextLong();
		Delivery d=new Delivery();
		d.displayDeliveryDetails(j);
	
	
	}
	}
	}
		

 





