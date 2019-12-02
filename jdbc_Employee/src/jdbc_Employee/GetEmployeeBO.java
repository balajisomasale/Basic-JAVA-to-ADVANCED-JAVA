package jdbc_Employee;

import java.util.List;

public class GetEmployeeBO {

	public static void main(String [] args) throws Exception
	{
	EmployeeDAO empr=new EmployeeDAO();
	List<Employee> t=empr.getAllEmployees();
	empr.display(t);
	
	
	}
	
	
	
}
