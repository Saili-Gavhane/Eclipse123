import java.sql.*;
import java.util.*;

public class Story2 {
	public void story2() throws ClassNotFoundException,SQLException
	{
		 ConnectionDemo c2 = new ConnectionDemo();
		  Connection con=null;
		  con=c2.connect();
		  System.out.println("Enter the name of company");
		  Scanner sc = new Scanner(System.in);
			String comp=sc.next();
			String query1=("select date_received,product,company from customer_comp where company like '%"+comp+"%'");
			Statement st = con.createStatement();
			ResultSet rs1=st.executeQuery(query1);
			System.out.println("Result");
			  while(rs1.next())
			  {
				  String date2=rs1.getString("date_received");
				  String product1 = rs1.getString("product");
				  String company1 = rs1.getString("company");
				  System.out.println(date2+" "+product1+" "+company1);
			  }
			  st.close();
			  sc.close();
	}

}
