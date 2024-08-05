package amit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class group_by {
	public static void main(String args[])throws Exception {

		//step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2
			String url="jdbc:mysql://localhost:3306/jdbc";
			String password="root";
			String userid="root";
			Connection con=DriverManager.getConnection(url,userid,password);
			System.out.println("connection establish");
		     
			// step 
		Statement sc=con.createStatement();
		String sql="select emplyoee,sum(salary),avg(salary) from rm group by emplyoee";
		ResultSet rs=sc.executeQuery(sql);
		 
		while(rs.next())
		{
			System.out.println("the total amount of "+rs.getString(1)+"="+rs.getString(2));
		}
			
		
	}	
}

