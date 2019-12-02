import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
interface inter
{
	
double sum(List<Employee>li);
}
class Employee
{
	private int id;

	private String name;
	private int age;
	private double salary;
	
	Employee(int id,String name,int age,double salary)
	
	{
	this.id=id;
	this.name=name;
	this.age=age;
	this.salary=salary;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	

	}



public class Main {
public double  sumSalary(List<Employee>li)
{
	double total=0.0;
	for(Employee i:li)
	{
		total=total+i.getSalary();
	}

	return total;
}
	public static void main(String[] args)
	{
		
		
		Employee employee1 = new Employee(1, "John", 25, 100000.00); 
		Employee employee2 = new Employee(2, "Jack", 22, 90000.00); 
		Employee employee3 = new Employee(3, "Laura", 38, 120000.00); 
		Employee employee4 = new Employee(4, "Smith", 28, 90000.00); 
		List<Employee> employees = new ArrayList<>(); 
		employees.add(employee1); 
		employees.add(employee2); 
		employees.add(employee3); 
		employees.add(employee4); 
		
		
		List<Employee> ls=employees.stream().filter(i->i.getAge()<30).collect(Collectors.toList());
		System.out.println(ls);
		Main method=new Main();
		inter i=method::sumSalary;
	System.out.println(i.sum(employees));
		
		
		
		
	}
	
	
}
