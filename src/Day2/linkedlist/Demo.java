package Day2.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        System.out.println("working with Linked List");

        LinkedList list = new LinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        System.out.println(list);

        //traversing
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("In Reverse Order");
        for (int i = list.size()-1;i>=0;i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        int [] array = {10,20,30,40,40};
        int size = array.length;
        for (int i = 0; i<= array.length; i++)
            System.out.print(array);
        System.out.println();
        System.out.println("size of the array is" + size);

        String s = "shrishail";
        System.out.println(s.length());

    }
}
