package map;
import java.util.Hashtable;

public class HashTableDemo {
    private static void putMethod(){
        //creating the empty hash table
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        //Put( )
        // Inserting values into the table
        hashtable.put(10,"Laptop");
        hashtable.put(14,"Monitor");
        hashtable.put(13,"Computer");
        hashtable.put(12,"Mouse");
        hashtable.put(15,"KeyBoard");

        // Displaying the Hashtable
        System.out.println("Hash Table is: "+hashtable);

        //Inserting existing key along with new value
        hashtable.put(15,"Windows");
        System.out.println("Hash Table is: "+hashtable);

        // Inserting existing key along with new Key,value
        hashtable.put(20, "All");
        System.out.println(hashtable);

        // checking with null
        try {
            hashtable.put(null,null);
        }
        catch (NullPointerException exception){
            System.out.println("Value should not be "+exception.getMessage());
        }


        try {
            hashtable.put(null,"null");
            hashtable.put(null,"againNullKey");
        }
        catch (Exception e){
            System.out.println("message is "+e.getMessage());
        }
        System.out.println("============");

        System.out.println(hashtable.size());

    }

    public static void main(String[] args) {
        System.out.println("Working with Map: 1. HashTable");
        preDefinedMethodsOfMap();
        System.out.println("*********************************************************");
        putMethod();
        System.out.println("********************************************************");
        removeMethod();
    }

    private static void removeMethod() {
        //creating empty table
        Hashtable<String,Integer> hashtable = new Hashtable<>();
        hashtable.put("one",1);
        hashtable.put("two",2);
        hashtable.put("three",3);
        hashtable.put("five",5);
        hashtable.put("six",6);

        // Removing the existing key mapping
        hashtable.remove("two");
        // removing the non-existing key
        System.out.println(hashtable.remove("computer"));
        System.out.println(hashtable);

    }

    private static void preDefinedMethodsOfMap() {
        System.out.println("put(key,value)");
        System.out.println("remove(key)");
    }
}
