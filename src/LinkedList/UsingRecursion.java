package LinkedList;

public class UsingRecursion {
    public static class Node{
        int data;
        Node nextNode;
        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.nextNode = b;
        b.nextNode = c;
        c.nextNode = d;
        d.nextNode = e;
        display(a);
    }

    public static void display(Node head){
        if(head == null)
            return;
        System.out.print(head.data+" ");
        display(head.nextNode);
    }
}
