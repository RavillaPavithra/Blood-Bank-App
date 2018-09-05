import java.util.*;
import java.sql.*;

public class Bba {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			/*Connection con=DriverManager.getConnection("172.16.0.249","root","mysql");
			Statement s=con.createStatement();
		if(con!=null)
		{
			System.out.println("CONNECTED");
		}
		else
		{
			System.out.println("NOT CONNECTED");
		con.close();
		}*/
		}
		 catch(Exception e)
	        {
	            System.out.println(e);
	        }
		}
}

