package LinkedList;

import java.util.LinkedList;

class Node{
    int data;
    Node nextNode;

    public Node(int data) {
        this.data = data;
    }

}
public class LengthOfLinkedList {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        Node a = new Node(200);
        Node b = new Node(200);
        Node c = new Node(200);
        Node d = new Node(200);
        Node e = new Node(200);
        Node f = new Node(200);
        a.nextNode = b;
        b.nextNode = c;
        c.nextNode = d;
        d.nextNode = e;
        e.nextNode = f;

        for (int i=0; i<=5; i++){
            int num = 200;
            list.add(num);
            num++;
        }
    }
}
