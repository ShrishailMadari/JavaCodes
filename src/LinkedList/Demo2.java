package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();

        list.add(70);
        list.add(90);
        list.add(80);
        list.add(50);
        System.out.println("Objects inside ArrayList: "+ list +" size:" + list.size());

        LinkedList linkedList = new LinkedList<>();
        linkedList.addAll(list);
        System.out.println("objects inside Linked List: "+ linkedList +" size: "+linkedList.size());
        linkedList.add(0,100000);
        linkedList.addAll(2,list);
        linkedList.addFirst(0);
        linkedList.addLast(9000);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(linkedList);
        System.out.println(linkedList.contains(900));
        System.out.println(linkedList.containsAll(list));
        linkedList.removeFirst();
        linkedList.removeAll(list);
    }
}
