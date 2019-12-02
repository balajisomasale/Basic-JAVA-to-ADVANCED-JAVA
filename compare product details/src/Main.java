import java.util.Scanner;




class Product{
	
	private Long id;
	private String productName,supplierName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public Product(Long id, String productName, String supplierName) {
		super();
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}
	
	public boolean equals(Object o)
	{
		
		if(o == this)
		{
			return true;
			
			
		}
		
		
		if(!(o instanceof Product))
		{
			return false;
		}
		
		Product c=(Product) o;
		return Long.compare(id, c.id) == 0 && (c.productName).equals(productName) == true && (c.supplierName).equals(supplierName) ==true;
		
		
	}
	
}
public class Main {
	static void display(Product o)
	{
		System.out.println("Product Id is "+o.getId());
		
		System.out.println("Product Name is "+o.getProductName());
		System.out.println("Supplier Name is "+o.getSupplierName());
		
		
	}
	
	public static void main(String[] args)
	
	{
		long y,y1;
		String x,x1,p,p1,s,s1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product id"); 
		
		x=sc.nextLine();
			
		
		System.out.println("Enter the product name");
		p=sc.nextLine();
		System.out.println("Enter the supplier name");
		s=sc.nextLine();
	
		y=Long.parseLong(x);
		Product obj=new Product(y,p,s);
		
		display(obj);
		
		
System.out.println("Enter the product id"); 

		x1=sc.nextLine();
			
		
		System.out.println("Enter the product name");
		p1=sc.nextLine();
		System.out.println("Enter the supplier name");
		s1=sc.nextLine();
		sc.close();
		y1=Long.parseLong(x1);
		Product obj1=new Product(y1,p1,s1);
		
		display(obj1);
		if(obj.equals(obj1))
		{
			
			
			System.out.println("The two products are the same");
		}
		else 
			System.out.println("The two products are different ");
		
	
	}
}
