package hashmap;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("ankit",20);
        hashMap.put("naveen",25);
        System.out.println(hashMap);
        System.out.println(hashMap.hashCode());



    }
}
