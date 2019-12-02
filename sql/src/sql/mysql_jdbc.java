package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class mysql_jdbc {

	

	public static void main(String [] args) throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Loaded the DRIVER Class");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/balaji","root","password-1");
	System.out.println("hello");
	Statement st=con.createStatement();
	
	
	int x=st.executeUpdate("insert into student values(10,'cts')");
	
	
	con.close();
	
	
	
	}
	
	
}
