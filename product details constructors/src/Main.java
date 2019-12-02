import java.util.Scanner;
class Product
{private long id;
private String pname,sname;

		public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	
	
	public Product(long id,String pname,String sname)
	{
		
		this.id=id;
		this.pname=pname;
		this.sname=sname;
	}
	public Product()
	{
		this.id=0;
		this.pname=null;
		this.sname=null;
		
		
	}
	
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
		
	
void display()
{
	System.out.println("Product Id is "+getId());
	
	System.out.println("Product Name is "+getPname());
	System.out.println("Supplier Name is "+getSname());
	
	
}


		
		}
		public class Main {	
	public static void main(String[] args)
	{
		long y;
		String x,p,s;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product id"); 
		
		x=sc.nextLine();
			
		
		System.out.println("Enter the product name");
		p=sc.nextLine();
		System.out.println("Enter the supplier name");
		s=sc.nextLine();
		sc.close();
		y=Long.parseLong(x);
		Product obj=new Product(y,p,s);
		
		obj.display();
		
	
		
		
		
	}


	
}
