package jdbc_Employee;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InsertEmployeeBO {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter the Employee details");
		System.out.println("Enter the ID:");
		long x = sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter the Name:");
		String s=sc.nextLine();
		
		System.out.println("Enter the Date of birth (dd/MM/yyyy):");
		String date=sc.next();
		Date d;
		SimpleDateFormat f1=new SimpleDateFormat("dd/MM/yyyy");	
			d = f1.parse(date);
			
			System.out.println("Enter the Salary:");
			int sal=sc.nextInt();
			
			Employee employee =new Employee(x,s,d,sal);
			EmployeeDAO dao = new EmployeeDAO();
			dao.addEmployee(employee);
			
			
			
		
	}

}
