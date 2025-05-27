public class Ex2 
{
public static void main(String[] args)
{
    Employee2 emp3 = new Employee2(3, "james", "colulom", "finace");
    Employee emp4 = new Employee();
    // Example usage of emp3 to avoid unused variable warning
    System.out.println(emp3);

    System.out.println(emp4.empNo);

}
}