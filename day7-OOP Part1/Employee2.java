public class Employee2 
{
    int empNo;
    String firstName;
    String lastName;
    String department;
    
    public Employee2(int en, String fn, String ln, String dep)
    {
        this.empNo = en;
        this.firstName = fn;
        this.lastName = ln;
        this.department = dep;
    } 

    public Employee2()
    {
        System.out.println("object created");
    }
}
