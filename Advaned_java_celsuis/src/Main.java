
interface i1{
	
	


	public  double toCelsuisLambda(double fahrenheit);
	
	
}
public class Main {
	public static double toCelsuis(double fahrenheit)
	{
		return (fahrenheit-32)*(5.0/9.0);
	}
	public static void main(String [] args)
	{
		
		
		i1 mn=fahrenheit-> (fahrenheit-32)*(5.0/9.0);
		System.out.println(mn.toCelsuisLambda(104));
		System.out.println(Main.toCelsuis(104));
	}
	
	
	
	
}