package practice_hands_inclomeTax;

import java.util.Scanner;

public class Main {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	double salary,income = 0;
	salary=sc.nextDouble();
	//income=sc.nextDouble();
	
	if(salary<=250000)
	{
		income=0.0;
	}
	else if(salary<500000)
	{
		income=((salary-250000.0)*0.05);
	}
	else if(salary<1000000)
	{
		income=((salary-500000.0)*0.2)+(250000.0*0.05);
		
	}
	else if (salary>1000000)
	{
		
		income=((salary-1000000)*0.3)+(250000.0*0.05)+(500000.0*0.2);
	}
	System.out.println(income);

}
	
	
	
}
