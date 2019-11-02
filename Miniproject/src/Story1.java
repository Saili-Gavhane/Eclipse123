import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Story1 {
 public void story1() throws ClassNotFoundException,SQLException
 {
	 ConnectionDemo c = new ConnectionDemo();
	  Connection c1=null;
	  c1=c.connect();
	  System.out.println("connection established");
	  System.out.println("Enter the date of which you want to display details");
	  Scanner sc = new Scanner(System.in);
		String date1=sc.next();
		String query=("select * from customer_comp where date_received='"+date1+"'");
		Statement st = c1.createStatement();
		ResultSet rs=st.executeQuery(query);
		  while(rs.next())
		  {
			  String date2=rs.getString("date_received");
			  String product1 = rs.getString("product");
			  System.out.println(date2+product1);
		  }
		  //System.out.println("Enter the bank of which you want to display details");
		  st.close();
		  sc.close();
 }
}
