package LinkedList;

import java.util.LinkedList;

class Node {
    String data;
    Node nextNode;

    public Node(String data) {
        this.data = data;
    }

}

public class LengthOfLinkedList {
    public static void main(String[] args) {
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
        System.out.println("***************************");
        int l = findLengthUsingRecursion(a);
        System.out.println(l);
    }
        //wrong code
    private static int findLengthUsingRecursion(Node head) {
        int count = 0;
        while (head != null) {
            System.out.println(head.data + " ");
            count++;
            findLengthUsingRecursion(head.nextNode);
        }
        return count;
    }

    private static int findLength(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.nextNode;
            count++;
        }
        return count;
    }
}
