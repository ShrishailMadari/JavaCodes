package Day3;

public class Concepts {
    public static void main(String[] args) {
        String a[] = {"groovy","js","python","java"};
        for (int i = 0 ; i < a.length ; i++ ){
            System.out.println(a[i]);
        }
        System.out.println();
        System.out.println("Enhanced for Loop");
        for (String b : a) {
            System.out.println(b);
        }
    }
}
