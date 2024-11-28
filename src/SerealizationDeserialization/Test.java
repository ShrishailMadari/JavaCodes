package SerealizationDeserialization;

import java.io.*;

class Customer {
    private String name;
    private String email;
    private Integer num;
    private Integer age;
    private String address;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", num=" + num +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public Customer() {
    }

    public Customer(String name, String email, Integer num, Integer age, String address) {
        this.name = name;
        this.email = email;
        this.num = num;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayName(){
        System.out.println("my name is "+this.name);
    }

}
public class Test{
    public static void main(String[] args) throws IOException {
        Customer customer = new Customer("hambaa","hamb@gmail.com",12345,54,"bangalore");

        FileOutputStream fileInputStream = new FileOutputStream("object.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileInputStream);


    }
}
