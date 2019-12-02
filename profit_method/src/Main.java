import java.util.Scanner;

public class Main {

public float calculateProfit(int  dozenCount, int pricePerDozen,  int  sellPrice)
{
	float p,p1;
	
	
	
	
	//try {
		if(pricePerDozen<0||  sellPrice<0)
		{
			throw new  IllegalArgumentException("Buying price or selling price cannot be lesser than 0");
		}
		
		/*
		
	}
	catch(Exception e)
	{
		e.printtrackspace();
		
		
		
		
	}*/
	p1=(sellPrice-(pricePerDozen)/12.0f);
	p=(p1/(pricePerDozen/12.0f))*100;
	
	return p;
	//System.out.println("Cost Price of 1 toy "+cp);

	
	

}
	
	public static void main(String[] args)
	{   
		int x,y,z;
		
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter the number of dozens of toys purchased");
		x=sc.nextInt();
		
		System.out.println("Enter the price per dozen");
		 y=sc.nextInt();
		 
			System.out.println("Enter the selling price of 1 toy");
			z=sc.nextInt();
		
		//System.out.println("Profit is"+p1);
		
		
		sc.close();
		Main obj=new Main();
	
		System.out.printf("Sam's profit percentage is %.2f percent",obj.calculateProfit(x, y, z));
		
		
		
	}
	
	
}
