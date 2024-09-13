package designpatterns;
class Girl{
    private static Girl girl;
    String girlName = "Veda";
    private Girl(){
        System.out.println("marriage a single girl");
    }
    public static Girl marryingHer(){
        if (girl == null){
            girl = new Girl();
        }else {
            System.out.println("fucked up :(");
        }
        return girl;
    }
}
public class Marriage {
    public static void main(String[] args) {
        Girl girl = Girl.marryingHer();
        System.out.println("marrying "+girl.girlName);
        Girl girl1 = Girl.marryingHer();
        Girl girl2= Girl.marryingHer();
        Girl girl3 = Girl.marryingHer();
    }
}
