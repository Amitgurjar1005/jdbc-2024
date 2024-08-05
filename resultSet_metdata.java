package amit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class resultSet_metdata {
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
		String sql="select *from rm";
		ResultSet rs=sc.executeQuery(sql);
		 ResultSetMetaData a=rs.getMetaData();
		 int i=a.getColumnCount();
		 while(rs.next()) {
		 for(int m=1;m<=i;m++)
		 {

 		System.out.print(rs.getString(m)+"\t");
		
	}	
		System.out.println("\n");
}
}
}