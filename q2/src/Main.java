import java.util.Scanner;

public class Main {


	
	public static void main(String[] args)
	{   
		float x,y,z,sp;
		double cp,p1,p;
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter the number of dozens of toys purchased");
		x=sc.nextInt();
		
		System.out.println("Enter the price per dozen");
		 y=sc.nextInt();
		 
			System.out.println("Enter the selling price of 1 toy");
			z=sc.nextInt();
		cp=(y/12);
		
		//System.out.println("Cost Price of 1 toy "+cp);
	
		
		p1=(z-cp);
		//System.out.println("Profit is"+p1);
		
		p=(p1/(cp))*100;
		
		System.out.printf("Sam's profit percentage is %.2f percent",p);
		
		
		sc.close();
		
		
	}
	
	
}
