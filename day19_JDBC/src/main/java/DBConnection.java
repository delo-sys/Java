
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


public class DBConnection 
{
    Connection con=null;
    
    public static Connection connect()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:ContactsDB.db");
            
            System.out.println("Connected to ContactsDB ");
            
            return con;
            
        }
        catch(Exception ex)
        {
            System.out.println("Connection failed "+ ex);
            return null;
        }
        
    }
    
    public static void main(String[] args)
    {
        connect();
        
    }
    
}
