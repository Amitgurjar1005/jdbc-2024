package amit;

import java.sql.Connection;

import java.util.*;
import java.sql.*;

public class update1 {
 public static void main(String args[])throws Exception {
	//step 1
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("enter the rool no to delete the record");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String sql="delete from student2026 where ROLLNO=?";
	//step 2
		String url="jdbc:mysql://localhost:3306/jdbc";
		String password="root";
		String userid="root";
		Connection con=DriverManager.getConnection(url,userid,password);
		System.out.println("connection establish");
	
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setInt(1,n);
	int m=	ps.executeUpdate();
	System.out.println("row affected"+m);
	con.close();
		
 }

}
