import java.util.*;
import java.sql.*;
 
public class insert
{
    public static void main(String args[])
    {
        String donarname = "pavithra";
        int  age = 21;
        String address = "tirupati";
        String emailid = "ravillapavithra@gmail.com";
        long mobile = "9908956722;
        String bloodgroup = "o";
        String gender = "female";
        
         
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("172.16.0.249", "root", "mysql");
            Statement stmt = con.createStatement();
             
           
            String q1 = "insert into userid values('" +donarname+ "', '" +age+ 
                                  "', '" +address+ "', '" +emailid+ "', '" +mobile+ "', '" +bloodgroup+"','"+gender+"' )";
            int x = stmt.executeUpdate(q1);
            if (x > 0)            
                System.out.println("Successfully Inserted");            
            else           
                System.out.println("Insert Failed");
             
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);