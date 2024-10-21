package LinkedList;

public class DisplayingLL {

    public static class Node{
        int data;
        Node nextNode;

        public Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a =new Node(9);
        Node b =new Node(19);
        Node c =new Node(119);
        Node d =new Node(29);
        Node e =new Node(49);
        a.nextNode = b; //9->19
        b.nextNode = c; //9->19->119
        c.nextNode = d; //9->19->119->29
        d.nextNode = e; //9->19->119->29-49

        Node temp = a;
        System.out.println(a.data);
        //using for loop
        for (int i = 1; i <= 5; i++){
            System.out.println(temp.data+" ");
            temp = temp.nextNode;
        }
        System.out.println("**************************************");
        //using while loop
        Node tempo = a;
        while(tempo != null){
            System.out.println(tempo.data+ " ");
            tempo = tempo.nextNode;
        }
    }
}
