package amit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class joins_two_table {
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
		String sql=" select empid,salary from emp1,empdetail where emp1.projectid=empdetail.projecteid;";
		ResultSet rs=sc.executeQuery(sql);
		 rs.next();
		while(rs.next())
		{
			System.out.println(rs.getString(1)+","+rs.getString(2));
		}
			
		
	}	
}
