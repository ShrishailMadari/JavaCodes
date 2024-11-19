package Java8codes.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CustomerTesting {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1L, "John", "Doe", "john.doe@example.com", "1234567890", "123 Elm Street", "New York", "USA",63,273323));
        customers.add(new Customer(2L, "Jane", "Smith", "jane.smith@example.com", "2345678901", "456 Oak Avenue", "Los Angeles", "USA",43,321212));
        customers.add(new Customer(3L, "Emily", "Johnson", "emily.johnson@example.com", "3456789012", "789 Pine Road", "Chicago", "USA",34,87543));
        customers.add(new Customer(4L, "Michael", "Williams", "michael.williams@example.com", "4567890123", "101 Maple Lane", "Houston", "USA",87,23432));
        customers.add(new Customer(5L, "David", "Brown", "david.brown@example.com", "5678901234", "202 Birch Blvd", "Phoenix", "USA",12,3241132));
        customers.add(new Customer(6L, "Laura", "Jones", "laura.jones@example.com", "6789012345", "303 Cedar Circle", "Philadelphia", "USA",23,92342));
        customers.add(new Customer(7L, "Matthew", "Garcia", "matthew.garcia@example.com", "7890123456", "404 Redwood Drive", "San Antonio", "USA",91,789342));
        customers.add(new Customer(8L, "Sophia", "Martinez", "sophia.martinez@example.com", "8901234567", "505 Palm Terrace", "Dallas", "USA",28,765434));
        customers.add(new Customer(9L, "James", "Rodriguez", "james.rodriguez@example.com", "9012345678", "606 Aspen Path", "San Diego", "USA",76,131112));
        customers.add(new Customer(10L, "Olivia", "Lee", "olivia.lee@example.com", "0123456789", "707 Spruce Avenue", "San Jose", "USA",53,987118));
        customers.add(new Customer(11L, "Daniel", "Gonzalez", "daniel.gonzalez@example.com", "1239876540", "808 Willow Parkway", "Austin", "USA",62,889997));
        customers.add(new Customer(12L, "Ava", "Hernandez", "ava.hernandez@example.com", "2348765431", "909 Oakmont Blvd", "Jacksonville", "USA",24,753498));
        customers.add(new Customer(13L, "William", "King", "william.king@example.com", "3457654322", "1010 Elmwood Street", "Fort Worth", "USA",22,121334));
        customers.add(new Customer(14L, "Isabella", "Scott", "isabella.scott@example.com", "4566543213", "1111 Maple Ridge", "Columbus", "USA",32,980987));
        customers.add(new Customer(15L, "Lucas", "Adams", "lucas.adams@example.com", "5675432104", "1212 Oakwood Road", "Charlotte", "USA",34,998768));
        customers.forEach(System.out::println);// using for each imperatively
        System.out.println();
        System.out.println("****************************************************************************************************************************************************************************************");

        //using traditional for each loop
        List<Long> customerList = new ArrayList<>();
        for (Customer customer : customers) {
            customerList.add(customer.getId());
        }
        System.out.println(customerList);
//using map():
        Stream<Customer> streamOfCustomers = customers.stream(); //creates the streams of the customer
        Stream<Long> longStream = streamOfCustomers.map(Customer::getId); //intermediate operations using lambda
//        Stream<Long> longStreamReference = streamOfCustomers.map(Customer::getId); //intermediate operations using method reference
        List<Long> list = longStream.toList();
        System.out.println(list);

        //using filter,
//        getting the Customer names whose age is >30
        Stream<String> customerStream = customers.stream().filter(customer -> customer.getAge() > 30).map(Customer::getFirstName);//two internal operations
        List<String> list1 = customerStream.toList();
        System.out.println(list1);

        //for each loop
        List<String> customersForList = new ArrayList<>();
        for (Customer customer : customers){
            if(customer.getAge()>30){
                customersForList.add(customer.getFirstName());
            }
        }
        System.out.println(customersForList);
        System.out.println();

        //printing the all city names
        List<String> cityNames = new ArrayList<>();
        for (Customer customer: customers){
            cityNames.add(customer.getCity());
        }
        System.out.println(cityNames);
        System.out.println();
        //using streams
       Stream<Customer> customerStreamForCity = customers.stream();
        Stream<String> customerCity = customerStreamForCity.map(Customer::getCity);
        List<String>  cities = customerCity.distinct().toList();
        System.out.println(cities);
        System.out.println();

        //full stream pipeline
        customers.stream().map(Customer::getCity).forEach(System.out::println);

        //get Customer who's sal is >  20k
        List<String> customerNames = new ArrayList<>();
        for (Customer customer : customers){
            if(customer.getSalary()>50000){
                customerNames.add(customer.getFirstName());
            }
        }
        System.out.println(customerNames);

        System.out.println();
        Stream<Customer> customerSalary = customers.stream().filter(customer -> customer.getSalary() > 50000);
        customerSalary.map(Customer::getFirstName).forEach(System.out::println);
        System.out.println();
        //using cities name
        customers.stream().map(Customer::getCity).distinct().forEach(System.out::println);
        System.out.println();
        //using for loop
        for (Customer customer : customers) {
            String city = customer.getCity();
            System.out.println(city);
        }
        System.out.println();
        //getting first 3 customer as list using limiting
        List<Customer> list2 = customers.stream().limit(3).toList();
        System.out.print(list2);
        System.out.println();
        List<String> firstThreeNames = getFirstThreeNames(customers);
        System.out.println(firstThreeNames);

        //skipping first three elements
        List<String> skipFirstThreeCustomers = skipFirstThreeCustomers(customers);
        System.out.println(skipFirstThreeCustomers);
        System.out.println();
        //get all customers names in list
        List<String> allNamesOfCustomers = getAllNamesOfCustomers(customers);
        System.out.println(allNamesOfCustomers);

    }

    private static List<String> getAllNamesOfCustomers(List<Customer> customers) {
        List<String> names = new ArrayList<>();
        for (Customer customer: customers){
           names.add(customer.getFirstName());
        }
        return names;
    }

    private static List<String> skipFirstThreeCustomers(List<Customer> customers) {
        return customers.stream().skip(3).map(Customer::getFirstName).toList();
    }

    private static List<String> getFirstThreeNames(List<Customer> customers){

        List<String > firstThree = new ArrayList<>();
        for (int i=0; i<3 && i< customers.size(); i++){
            firstThree.add(customers.get(i).getFirstName());
        }
        return firstThree;
    }



}

