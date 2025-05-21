import javax.swing.JOptionPane;
public class Ex1 
{
    public static void main(String[] args)
    {
        String message;
        message = JOptionPane.showInputDialog("Enter your short message");
        
        JOptionPane.showMessageDialog(null, message);
    } 
}
