package jdbc_indepedent;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class transaction {

	public static void main(String [] args) throws Exception
	{
		
		
		Properties prop=new Properties();
		prop.load(new FileInputStream("C:\\Users\\799451\\jdbc_indepedent\\src\\config.properties"));
		
		String driver=prop.getProperty("driver");

		String url=prop.getProperty("url");
		

		String username=prop.getProperty("system");

		String password=prop.getProperty("password");
		
		Class.forName(driver);
		
		Connection con=DriverManager.getConnection(url,username,password);
	
		Statement st=con.createStatement();
		
	con.setAutoCommit(false);
	int x=st.executeUpdate("update balu set bal=bal-1000 where accno=1000");
	int y=st.executeUpdate("update balu set bal=bal+1000 where accno=1001");
	
	
	if(x>0 && y>0)
	{
		
		con.commit();
		
	}

	
	else 
	{
		
		con.rollback();
		System.out.println("Transaction Failed,Please check ur credentials ");
		
	}
		con.close();
		
		
		
		
		
		
		
	}
	
	
	
}
