public class Ex1 
{
    public static void main(String[] args) 
    {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.empNo=001;
        emp1.firstName="Fidel";
        emp1.lastName="Castro";
        emp1.department="developer";

        emp2.empNo=002;
        emp2.firstName="Che";
        emp2.lastName="Guevara";
        emp2.department="programmer";
        System.out.println(emp1);
        System.out.println(emp2.empNo);
    }
}