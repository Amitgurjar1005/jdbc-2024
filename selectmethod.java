package amit;


 import java.sql.*;
public class selectmethod {
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
			String sql="select *from student2026 where BRANCH='cs'";
			ResultSet s=sc.executeQuery(sql);
		s.next();
			String s1= s.getString(1);
			String s2= s.getString(2);
			System.out.println(s1);
			
		
		
		
}
}