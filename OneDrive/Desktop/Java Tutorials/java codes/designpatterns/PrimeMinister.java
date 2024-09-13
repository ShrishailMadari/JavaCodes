package designpatterns;
class Election{
    String name = "Narendra Modi";
    private static Election election;
    private Election(){
        System.out.println("Modi: BJP Got Majority, so Modi got elected");
    }

    public static  Election selectPrimeMinister(){
        if (election == null){
            election = new Election();
        }else
        {
            System.out.println("Congress has taken the lead");
        }
        return election;
    }
}
public class PrimeMinister {
    public static void main(String[] args) {
        Election name = Election.selectPrimeMinister();
        System.out.println("Name: "+name.name);
        Election.selectPrimeMinister();
        Election.selectPrimeMinister();
    }
}
