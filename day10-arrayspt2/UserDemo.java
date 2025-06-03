import java.util.Scanner;
public class UserDemo 
{
    public static void main(String[] args) {
        // create an array to store references of 5 user objects
        User[] usersArray= new User[5];
        
        createUser(usersArray);
        for(int index=0;index<usersArray.length;index++)
        {
            System.out.printf("User #%d name:%s Email:%s\n",index+1,usersArray[index].getUserName(), usersArray[index].getUserEmail());
        }
    }
    public static void createUser(User[] arr)
    {
        String uname,uemail;
        Scanner kb_input=new Scanner(System.in);
        // create 5 user and store them into an array
        for(int index=0; index<5;index++)
        {
            System.out.println("Enter username for user#"+(index+1));
            uname=kb_input.nextLine();
            System.out.println("Enter Email for user#"+(index+1));
            uemail=kb_input.nextLine();
            arr[index]=new User(uname,uemail);
        }
    }
}
