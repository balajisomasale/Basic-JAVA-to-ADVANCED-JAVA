import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
	
	
	float x,y,z,dis1,res;
	int dis;
	Scanner sc=new Scanner(System.in);
	System.out.println("Price of item 1 :");
	x=sc.nextFloat();
	
	System.out.println("Price of item 2 :");
	y=sc.nextFloat();

	System.out.println("Discount in percentage :");
	dis=sc.nextInt();
	
	z=x+y;
	
	dis1=z*dis/100;
	
	
	res=(z-dis1);
	System.out.printf("Total amount : $%.2f\n",z);
	System.out.printf("Discounted amount : $%.2f\n",res);
	System.out.printf("Saved amount : $%.2f",dis1);
	
	
	}
	
	
	
}
