package amit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;

public class input {
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
			String sql="update student2026 set SEM=SEM+1";
			
			int n=obj.executeUpdate(sql);
			System.out.println(n+"row affect");
			//step 5
			
			con.close();
			}
}

}
