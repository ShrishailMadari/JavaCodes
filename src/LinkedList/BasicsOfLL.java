package LinkedList;

public class BasicsOfLL {
    public static class Node{
        int data; //value
        Node next; //address of next node
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(4);
        Node c = new Node(4);
        Node d = new Node(4);

        System.out.println(a.data);
        System.out.println(b.next);
        //connecting the nodes
        a.next = b;
        System.out.println(a.next.data+" "+b.data);

    }
}
