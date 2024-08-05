package amit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class amit {
	public static void main(String args[])throws Exception {

//step 1
	Class.forName("com.mysql.cj.jdbc.Driver");
//step 2
	String url="jdbc:mysql://localhost:3306/jdbc";
	String password="root";
	String userid="root";
	Connection con=DriverManager.getConnection(url,userid,password);
	System.out.println("connection establish");
     
	//step 3
	Statement obj=con.createStatement();
// step 4
	//String sql="insert into student2026 values(1201,'abhi','cs',5)";
	
	//int n=obj.executeUpdate(sql);
	//System.out.println(n+"row affect");
	//step 5
	obj.executeUpdate("insert into student2026 values(12090,'amit','cs',5)");
	obj.executeUpdate("insert into student2026 values(12085,'alok','cs',5)");
	obj.executeUpdate("insert into student2026 values(12086,'aman','cs',5)");
	obj.executeUpdate("insert into student2026 values(12087,'aditya','cs',5)");
	obj.executeUpdate("insert into student2026 values(12088,'anuj','cs',5)");
	obj.executeUpdate("insert into student2026 values(12089,'dheeraj','cs',5)");
	con.close();
	}
}