import java.sql.*;
import java.util.*;
public class Story3 {
	public void story3() throws ClassNotFoundException,SQLException
	{
		 ConnectionDemo c3 = new ConnectionDemo();
		  Connection con1=null;
		  con1=c3.connect();
		  System.out.println("Enter the complaint id");
		  Scanner sc = new Scanner(System.in);
			int id=sc.nextInt();
			String query1=("select * from customer_comp where complaint_id="+id+"");
			Statement st = con1.createStatement();
			ResultSet rs2=st.executeQuery(query1);
			System.out.println("Result");
			  while(rs2.next())
			  {
				  String date2=rs2.getString("date_received");
				  String product1 = rs2.getString("product");
				  String company1 = rs2.getString("company");
				  System.out.println(date2+" "+product1+" "+company1);
			  }
			  st.close();
			  sc.close();
	}

}
