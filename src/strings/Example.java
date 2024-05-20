package strings;

public class Example {
    public static void main(String[] args) {
        System.out.println("what is the output of this: ");
        String s = "physics";
        for (int j = 2; j < 4; j++) {
            System.out.println(s.substring(j));
        }
        System.out.println();
        subString();

        System.out.println();
        interningAndNew();
        System.out.println();
        immutableOfString();
        System.out.println();
        compareMethods();

    }

    static void subString() {
        String s = "abcd";
        for (int i = 0; i <=3; i++) {
            for (int j = i + 1; j <=4; j++) {
                System.out.println(s.substring(i,j));
            }
        }
    }
    static void interningAndNew(){
        String str = "hello";
        String gtr = "hello";
        System.out.println(str+" "+gtr);
        System.out.println(str.hashCode()+" "+gtr.hashCode());
        String s1 = new String("hello");
        System.out.println(s1.hashCode());
    }
    static void immutableOfString(){
        String s = "Hello";
        System.out.println(s);
        System.out.println(s.hashCode());

        s="Hi";
        System.out.println(s);
        System.out.println(s.hashCode());
    }
    static void compareMethods(){
        String s1 = "Shri";
        String s2 = "Shri";
        String s3 = new String("Shri");
        System.out.println(s1.hashCode()+" "+s2.hashCode());
        System.out.println(s1.hashCode()==s2.hashCode());
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s3));
    }
}
