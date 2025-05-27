public class personalData 
{
    private String name;
    private String address;
    private int age;
    private String phoneNumber;

    public personalData(String n, String ad, int age, String pn) 
    {
        this.name = n;
        this.address = ad;
        this.age = age;
        this.phoneNumber = pn;
    }
    public void setName(String name) 
    {
        this.name=name;
    }
    public String getName() 
    {
        return name;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }
    public String getAddress() 
    {
        return address;
    }
    public void setAge(int age) 
    {
        this.age = age;
    }
    public int getAge() 
    {
        return age;
    }
    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() 
    {
        return phoneNumber;
    }
}
