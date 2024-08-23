package tree;

public class BinaryTree {
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

        Node root;
        public BinaryTree() {
            root = null;
        }

        // Method to add a node to the tree
        public void add(int data) {
            root = addRecursive(root, data);
        }

        // Recursive method to add a node to the tree
        private Node addRecursive(Node current, int data) {
            if (current == null) {
                return new Node(data);
            }

            if (data < current.data) {
                current.left = addRecursive(current.left, data);
            } else if (data > current.data) {
                current.right = addRecursive(current.right, data);
            } else {
                // Value already exists
                return current;
            }

            return current;
        }

        // Method for in-order traversal of the tree
        public void traverseInOrder(Node node) {
            if (node != null) {
                traverseInOrder(node.left);
                System.out.print(" " + node.data);
                traverseInOrder(node.right);
            }
        }

        // Method for pre-order traversal of the tree
        public void traversePreOrder(Node node) {
            if (node != null) {
                System.out.print(" " + node.data);
                traversePreOrder(node.left);
                traversePreOrder(node.right);
            }
        }

        // Method for post-order traversal of the tree
        public void traversePostOrder(Node node) {
            if (node != null) {
                traversePostOrder(node.left);
                traversePostOrder(node.right);
                System.out.print(" " + node.data);
            }
        }

        public static void main(String[] args) {
            BinaryTree bt = new BinaryTree();

            /* Add nodes to the tree */
            bt.add(6);
            bt.add(4);
            bt.add(8);
            bt.add(3);
            bt.add(5);
            bt.add(7);
            bt.add(9);

            /* Traverse the tree */
            System.out.print("In-order traversal:");
            bt.traverseInOrder(bt.root);
            System.out.println();

            System.out.print("Pre-order traversal:");
            bt.traversePreOrder(bt.root);
            System.out.println();

            System.out.print("Post-order traversal:");
            bt.traversePostOrder(bt.root);
            System.out.println();
        }


}
