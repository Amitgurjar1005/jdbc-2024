package amit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class resultset_delete_program {
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
			Statement sc=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			String sql="select *from student2026";
		
			ResultSet s=sc.executeQuery(sql);
			s.absolute(1);
			s.deleteRow();
			
}
}