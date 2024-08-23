package practice.com;

public class Bike {
    Bike(int cost, String name){
        System.out.println("price is "+cost+" name is "+name);
    }

    public static void main(String[] args) {
        Bike bike = new Bike(100,"jav42");
    }
}
