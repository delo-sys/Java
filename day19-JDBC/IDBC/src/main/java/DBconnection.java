
import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection 
{
    public static Connection konnect() throws Exception
    {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("JDBC:sqlite:ContactsDB.db");
            System.out.println("connected to contactDB");
            return con;
        } catch (Exception ex) 
        {
            System.out.println("connection failed"+ex);
            throw ex;
    }
}
}
