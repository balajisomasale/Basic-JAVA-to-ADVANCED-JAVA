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
	
	public String toString()
	{
		System.out.println(id+" : "+productName+" : "+supplierName);
		return productName;
		
	}
	
	
	
}
public class Main {
	
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
		sc.close();
		obj.toString();
		
		System.out.println("Invoking getClass() method : "+obj.getClass());
	}		

}
