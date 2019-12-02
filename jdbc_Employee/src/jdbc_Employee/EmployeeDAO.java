package jdbc_Employee;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

	
	void addEmployee(Employee employee) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","password-1");		
		PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");
		
		ps.setInt(4, employee.getSalary());
		
		ps.setLong(1,employee.getEmployeeId());
		ps.setString(2,employee.getName());
		Date dsw=new Date(employee.getDateOfBirth().getTime());
		ps.setDate(3,dsw);
		
		ps.executeUpdate();
		con.close();
		System.out.println("The Given data is successfully inserted to the database.");
	}
	List<Employee> getAllEmployees() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","password-1");		
		Statement st=con.createStatement();
		List<Employee> lst=new ArrayList<Employee>();
		ResultSet rs=st.executeQuery("select * from employee");
		while(rs.next())
		{
			
			Employee ob=new Employee(rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getInt(4));
			lst.add(ob);
			
			
		}
		return lst;
		
	}
	
	void display(List<Employee>lst)
	{
		for(Employee o:lst)
		{
			SimpleDateFormat f1=new SimpleDateFormat("dd/MM/yyyy");
			String da=f1.format(o.dateOfBirth);
			System.out.println(o.name+""+da+""+o.salary);
		
		}
		}
		
		
	}
	

