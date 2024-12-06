package methodchaining;
class Customer{
    private int id;
    private String name;
    private String emailId;
    private String city;



    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public Customer setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmailId() {
        return emailId;
    }

    public Customer setEmailId(String emailId) {
        this.emailId = emailId;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Customer setCity(String city) {
        this.city = city;
        return this;
    }
    public static Customer method(){
        return new Customer();
    }
}
public class ExampleWithMethodChaining {
    public static void main(String[] args) {
        Customer customer = new Customer().setCity("kij")
                .setEmailId("shr@gmail.com")
                .setName("ghj");

        System.out.println(customer);
       Customer cust = Customer.method()
                .setName("shri")
                .setCity("gadag")
                .setEmailId("sd@gmail")
                .setId(100);
        System.out.println(cust);
    }
}
