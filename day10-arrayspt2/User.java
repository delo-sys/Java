public class User 
{
    String userName;
    String userEmail;
    public User()
    {

    } 
    public User(String uname)
    {
        this.userName=uname;
    }
    public User(String uname,String uemail)
    {
        this.userName=uname;
        this.userEmail=uemail;
    }
    public String getUserName() 
    {
        return this.userName;
    }

    public String getUserEmail() 
    {
        return this.userEmail;
    }
}