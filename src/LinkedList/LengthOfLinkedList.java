package LinkedList;

import java.util.LinkedList;

class Node{
    String data;
    Node nextNode;

    public Node(String data) {
        this.data = data;
    }

}
public class LengthOfLinkedList {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        Node a = new Node("200");
        Node b = new Node("300");
        Node c = new Node("400");
        Node d = new Node("500");
        Node e = new Node("600");
        Node f = new Node("700");
        a.nextNode = b;
        b.nextNode = c;
        c.nextNode = d;
        d.nextNode = e;
        e.nextNode = f;
        int length = findLength(a);
        System.out.println(length);
    }

    private static int findLength(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.nextNode;
            count++;
        }
        return count;
    }
}
