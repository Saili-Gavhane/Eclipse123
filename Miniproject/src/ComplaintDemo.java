import java.sql.*;
import java.util.*;
public class ComplaintDemo {
	public static void main(String args[]) throws ClassNotFoundException,SQLException 
	{     
	   System.out.println("Enter the choice to search a customer");	
	   System.out.println("1.Search customer by complaint date");
	   System.out.println("2.Seach customer by company name");
	   System.out.println("3.Search customer by complaint id");
	   Scanner scan = new Scanner(System.in);
	   int choice = scan.nextInt();
	   switch(choice)
	   {
	   case 1:
	   Story1 st1 = new Story1();
	   st1.story1();
	   case 2:
	   Story2 st2 = new Story2();
	   st2.story2();
	   case 3:
	   Story3 st3 = new Story3();
	   st3.story3();
	   }
	   scan.close();
	}
}

