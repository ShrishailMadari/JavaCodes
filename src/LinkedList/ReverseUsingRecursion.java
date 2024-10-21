package LinkedList;

public class ReverseUsingRecursion {
    public static class Node{
        int data;
        Node nextNode;

        public Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(200);
        Node c = new Node(300);
        Node d = new Node(400);
        Node e = new Node(500);
        Node f = new Node(600);

        a.nextNode = b;
        b.nextNode = c;
        c.nextNode = d;
        d.nextNode = e;
        e.nextNode = f;

        reverseDisplay(a);
    }

    public static void reverseDisplay(Node head){
        if (head==null)
            return;
        reverseDisplay(head.nextNode);
        System.out.println(head.data+" ");
    }
}
