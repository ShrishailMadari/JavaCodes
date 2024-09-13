package designpatterns;
/* 1) Create a private constructor(creating private constructor outside the class is not possible,
        so have to create in the respective class only

   2) create a public static method(helper method), so tht could be accessed outside the class, since
        static could be accessed with the help of class name
        Now method could be called outside the class multiple times which should not be done

   3) private static AadhaarCard aadhaarCard; private so that no one can access, static so that static method creating object

   */
class AadhaarCard{
    private static AadhaarCard aadhaarCard;
    private AadhaarCard(){
        System.out.println("aadhaar is created. ");
    }

    public static void createdAadhaar(){
        if (aadhaarCard == null){
            aadhaarCard = new AadhaarCard();
        }else {
            System.out.println("Aadhaar card cant be created");
        }
    }
}
public class SingletonDesignPattern {
    public static void main(String[] args) {
        AadhaarCard.createdAadhaar();
        AadhaarCard.createdAadhaar();
        AadhaarCard.createdAadhaar();
        AadhaarCard.createdAadhaar();
    }
}
