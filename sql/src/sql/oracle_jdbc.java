package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class oracle_jdbc {

	
	
	public static void main(String [] args) throws Exception{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("Loaded the DRIVER Class");
	
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password-1");
	System.out.println("hello");
	Statement st=con.createStatement();
	
	//Non-select queries
	int x=st.executeUpdate("insert into bal values(10,'cts')");
	
	//SELECT Queries
	ResultSet rs=st.executeQuery("SELECT * from bal");
	
	while(rs.next())
	{
		System.out.println(rs.getInt(1) + "" +rs.getString(2));
		
		
	}
	
	
	con.close();
	
	
	
	
	
	
	
	}
}
