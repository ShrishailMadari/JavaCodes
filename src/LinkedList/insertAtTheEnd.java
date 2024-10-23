package LinkedList;

public class insertAtTheEnd {
    // Function to insert a new node at the beginning of the
    // list
    public static Node insertAtFront(Node head,
                                     int new_data) {

        // Create a new node with the given data
        Node new_node = new Node(new_data);

        // Make the next of the new node point to the
        // current head
        new_node.nextNode = head;
        System.out.println("new node pointing to the current Node");
        // Return the new node as the new head of the list
        return new_node;

    }

    public static class Node{
        int data;
        Node nextNode;

        public Node(int data) {
            this.data = data;
            this.nextNode = null;
        }
    }
    //iterating the nodes
   /* get Node and store in tempo
    you check tempo is null
    if not null print data and point to next node*/
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.nextNode;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node first = new Node(2);
        first.nextNode = new Node(3);
        first.nextNode.nextNode= new Node(4);
        first.nextNode.nextNode.nextNode = new Node(5);
        first.nextNode.nextNode.nextNode.nextNode = new Node(6);
        System.out.println();
        // Printing the original linked list
        System.out.println("Original list:");
        printList(first);
        int data = 1;
        Node node = insertAtFront(first, data);
        printList(node);
    }
}
