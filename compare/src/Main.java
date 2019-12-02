import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args)
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		x=sc.nextInt();
		
		System.out.println("Enter the second number");
		y=sc.nextInt();
		sc.close();
		if(x<y){
		System.out.println(x+" is less than "+y);
		}
		else if(x>y)
		{
		System.out.println(x+" is greater than "+y);	
			
		}
		else{
			System.out.println(x+" is equal to "+y);
		}
		
	}
}
