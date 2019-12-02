package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class prepare_statemnts {
	public static void main(String [] args) throws Exception{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Loaded the DRIVER Class");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password-1");
			System.out.println("hello");
			
			PreparedStatement ps=con.prepareStatement("insert into bal values(?,?)");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter st id");
			int stid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter st name");
			String stname=sc.nextLine();
			
			ps.setInt(1,stid);
			ps.setString(2, stname);
			
			int x=ps.executeUpdate();
			System.out.println(x+"Rows inserted");
			
		
		
		
		
	}

}
