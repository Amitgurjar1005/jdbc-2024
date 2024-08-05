package amit;

import java.util.*;
import java.sql.*;
public class inputdataentry {
	public static void main(String args[]) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("enter the detail of student");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the rollno");
	int rollno=sc.nextInt();
	
	System.out.println("enter the name");
	String name=sc.next();

	System.out.println("enter the branch");
	String branch=sc.next();
		System.out.println("enter the sem");
		int sem=sc.nextInt();

	
	String sql="insert into student2026 values (?,?,?,?)";
//step 2
	String url="jdbc:mysql://localhost:3306/jdbc";
	String password="root";
	String userid="root";
	Connection con=DriverManager.getConnection(url,userid,password);
	System.out.println("connection establish");
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1,rollno);
	ps.setString(2,name);
	ps.setString(3,branch);
	ps.setInt(4,sem);
	int n=ps.executeUpdate();
	System.out.println("row affected"+n);
	}
}
