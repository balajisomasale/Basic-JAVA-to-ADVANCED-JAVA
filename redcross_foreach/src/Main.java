import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args)
	{
		
		//String s[]={"Sun","Mon","Tue","Wen","Thu","Fri","Sat"};
		
		
		
		Scanner sc=new Scanner(System.in);
		int x;
		x=sc.nextInt();
		int[] a=new int[x];
		
	
		for(int i=0;i<x;i++)
		{ 
			//a[-1]=0;
			a[i]=sc.nextInt();
			
			
		}
		int t1=0;
		for(int t:a)
		{
			t1=t1+t;
			
		}
		System.out.println(t1);
		//System.out.println(a[i]);
		sc.close();
	}
}
