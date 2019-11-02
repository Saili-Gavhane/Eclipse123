import java.sql.*;
public class ConnectionDemo
	{ 
	 Connection conn;
	public Connection connect()
	{
		try
		{
		  String url=" jdbc:oracle:thin:@localhost:1521:xe";
		  String user="hr";
		  String password="hr";
		  
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  conn=DriverManager.getConnection(url,user,password);
		  System.out.println("Connection established");
		  return conn;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	}


