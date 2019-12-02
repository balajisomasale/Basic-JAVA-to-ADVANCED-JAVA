import java.util.Scanner;

public class Main {

	
	public static void main(String[] args)
	{
		
		int x,y,z;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter x");
		x=sc.nextInt();
		
		System.out.println("Enter y");
		y=sc.nextInt();
		
		System.out.println("Enter z");
		z=sc.nextInt();
				
		sc.close();
		
	int L1=x,L2=y,L3=z;
	
	if(L2<L1 && L2<L3)
	{
		
		System.out.println("L2 has the minimal seating capacity");
		
	}
	else if(L1<L2 && L1<L3)
	{
		System.out.println("L1 has the minimal seating capacity");
		
	}
	else {
		System.out.println("L3 has the minimal seating capacity");
	}
	
		
	}
}
