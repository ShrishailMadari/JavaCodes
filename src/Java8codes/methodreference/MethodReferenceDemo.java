package Java8codes.methodreference;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        System.out.println("this is method reference demo");

        //lambda exp impl of abstract method
        MethodReferenceInterface referenceInterface = (s)->{
            System.out.println(s.toUpperCase());
            return s.toUpperCase();
        };
        referenceInterface.village("hello");

//        re-using/executing a pre-defined method from string class
//        assigning tht method reference of Class
        MethodReferenceInterface methodReferenceInterface = String::toUpperCase;
        String village = methodReferenceInterface.village("Binaural");
        System.out.println(village);
    }

}
