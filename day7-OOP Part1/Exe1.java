/*Design a class that holds the following personal data: name,address,age and phonenumber .write approprate accessor and mutator methods .Demostrate the class by writing a program that create three instances of it .one inastance should hold your information , and the other two should hold your friend or family members information.   */
public class Exe1 {
    public static void main(String[] args) 
    {
        personalData friend1 = new personalData(null, null, 0, null);
        friend1.setName("Alice");
        friend1.setAddress("123 Maple Street");
        friend1.setAge(25);
        friend1.setPhoneNumber("555-1234");
    }

    public static void displaywelcomeMessage() {
        System.out.println("Welcome to the Personal Data Program!");
    }
}
