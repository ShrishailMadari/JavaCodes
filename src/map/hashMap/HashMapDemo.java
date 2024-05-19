package map.hashMap;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        System.out.println("Working with Hash Map: ");
        methods();
        System.out.println("===========================");

        //crating the object of hash map in two ways

        //1. it allows any type of key and any type of value if it is without Generics
        HashMap hashMapping = new HashMap();

        //2. it allows specified type of key and value entries if it is with Generics
        HashMap<Integer,String> hashMap = new HashMap();

        hashMapping.put("101",true);
        hashMapping.put(102,false);
        hashMapping.put(103,"null");
        hashMapping.put(true,"yes");

        System.out.println(hashMapping);
        System.out.println(hashMapping.get(102));
        System.out.println(hashMapping.isEmpty());
        System.out.println(hashMapping.containsKey("101"));
        System.out.println(hashMapping.containsValue("yes"));
        System.out.println(hashMapping.remove(103));
        System.out.println("======================");
    }
    private static void methods(){
        System.out.println("pre defined Methods: ");
        System.out.println("put(key, value) : "+"inserts the objects" );
        System.out.println("get(key) : "+"retrieving the objects");
        System.out.println("remove(key) : "+"removing object based key mentioned");
        System.out.println("containsKey(key) : "+"checks whether the given key obj is there in map table or not");
        System.out.println("containsValue(value) : "+"checks whether the given value obj is there in map table or not");
        System.out.println("isEmpty() : "+"checks is map is empty or not, returns the boolean values");//not taking any param
        System.out.println(("clear() : "+"Clears the map"));//not taking any param
        System.out.println("keySet()");//not taking any param
    }
}
