package practice_hands_tax_Calculator;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the annual salary");
		double salary =sc.nextLong();
		
		System.out.println("Enter the age:");
		
		int age=sc.nextInt();
		AbstractTaxCalculator taxCalculator=null;
		
		if(age<60)
		{
			taxCalculator =new Under60TaxCalculator(salary);
			
		}
		else 
		{
			taxCalculator=new From60To80TaxCalculator(salary);
		}
		
		//AbstractTaxCalculator taxCalculator = new Under60TaxCalculator(790000.0);
		System.out.printf("%f", taxCalculator.calculateTax());
	}
}
