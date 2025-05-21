import  javax.swing.JOptionPane;
public class Exe1CircleArea 
{
    public static void main(String[] args)
    {
        String radiusInput;
        String message;
        double radius; 
        double area;
        radiusInput = JOptionPane.showInputDialog("Enter the radius");
        radius=Double.parseDouble(radiusInput);
        area= Math. PI *radius*radius;
        message="the area is "+area;
        JOptionPane.showMessageDialog(null,message);
    } 
}
