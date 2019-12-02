import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args)
	{
		
		//String s[]={"Sun","Mon","Tue","Wen","Thu","Fri","Sat"};
		
		
		
		Scanner sc=new Scanner(System.in);
		int x;
		x=sc.nextInt();
		int[] a=new int[x];
		int t=0,i=0;
	
		while(i<x) 
		{//a[-1]=0;
		a[i]=sc.nextInt();
				t=t+a[i];
				i++;
			
		}
		System.out.println(t);
		//System.out.println(a[i]);
		sc.close();
	}
}
