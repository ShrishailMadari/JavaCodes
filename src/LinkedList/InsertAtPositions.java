package LinkedList;

import java.util.Scanner;

public class InsertAtPositions {
    static class Node{
        String data;
        Node nextNode;

        public Node(String data) {
            this.data = data;
            this.nextNode = null;
        }
    }

    /*To insert a node at any position in a linked list, follow these steps:

### 1. **Create the New Node:**
   - Allocate memory for the new node.
   - Assign the data to the new node.
   - Set the `next` pointer of the new node to `null` initially.

### 2. **Check for Insertion at the Head (Position 0):**
   - If the position is `0` (inserting at the front), set the `next`
        pointer of the new node to the current head.
   - Update the head to point to the new node, as the new node becomes the first node in the list.

### 3. **Traverse to the Desired Position (For Non-Head Insertion):**
   - Start from the head and use a loop to traverse the list.
   - Stop at the node just before the position where the new node is to be inserted.
   - Ensure you handle cases where the position is out of bounds (greater than the number of nodes in the list).

### 4. **Insert the New Node:**
   - Adjust the `next` pointer of the new node to point to the node that comes after the current
            node at the desired position.
   - Update the `next` pointer of the current node (the node just before the insertion point)
            to point to the new node.

### 5. **Edge Cases:**
   - **Empty List:** If the list is empty (head is `null`), simply make the new node the head of the list.
   - **Out of Bounds:** If the position is greater than the length of the list,
        handle it by either inserting at the end or rejecting the insertion with an error message.
   - **Single Element List:** Handle insertion in a list with only one element by
        properly setting the new node’s pointers.

### 6. **Update Head (if Necessary):**
   - If the node was inserted at the head, update the `head` reference to point to the new node.
   - If the node was inserted elsewhere, the head remains unchanged.

### 7. **Complexity:**
   - **Time Complexity:** The time complexity is `O(n)` where `n` is the number of nodes before the
        insertion point because you need to traverse the list.
   - **Space Complexity:** The space complexity is `O(1)` since you are only allocating
        space for the new node.

These are the general steps for inserting a node at any position in a linked list.
Let me know if you need further clarification!*/


    public static void main(String[] args) {
        //creating nodes
        Node first  = new Node("Shrill");
        first.nextNode = new Node("john");
        first.nextNode.nextNode = new Node("khan");
        first.nextNode.nextNode.nextNode = new Node("salman");
        first.nextNode.nextNode.nextNode.nextNode = new Node("shilpa");
        first.nextNode.nextNode.nextNode.nextNode.nextNode = new Node("koala");
        // Print the original list
        System.out.print("Original list: ");
        printLists(first);

        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the position and node data: ");
        int position = scanner.nextInt();
        String data = scanner.next();

        // Insert the new node at the specified position
        Node updatedList = insertAtPosition(first, data, position);

        // Print the updated list
        System.out.print("List after inserting at position: ");
        printLists(updatedList);

    }

    private static void printLists(Node first) {
        Node tempo = first;
        while (tempo != null){
            System.out.print(tempo.data+" ");
            tempo = tempo.nextNode;
        }
        System.out.println();
    }

    private static Node insertAtPosition(Node first, String data, int position) {
        Node newNode = new Node(data);

        // If inserting at the front (position 0)
        if (position == 0) {
            newNode.nextNode = first;
            return newNode; // New node becomes the head
        }


        // Otherwise, find the node just before the position to insert
        Node current = first;
        for (int i = 1; i < position && current != null; i++) {
            current = current.nextNode;
        }

        // If the position is greater than the length of the list
        if (current == null){
            System.out.println("Position out of bounds.");
            return first;
        }

        // Insert the new node by adjusting the pointers
        newNode.nextNode = current.nextNode;
        current.nextNode = newNode;
        return first;
    }

}

