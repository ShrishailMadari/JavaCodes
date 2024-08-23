package constructor.constructorChaining;

public class Son extends Father{
    int sonId = 100;
    String sonName = "shri";
    int age = 10;
    Son(int sonId,String sonName){
        this.sonId = sonId;
        this.sonName = sonName;
        System.out.println("son is ready");
    }
    void sonGoToSchool(){
        int age = 20;
        System.out.println(super.age);
        System.out.println("Son is School");
    }

    public static void main(String[] args) {
        Son son = new Son(10,"shridhar");
        son.sonGoToSchool();
        son.callFather();
        System.out.println(son.age);
        System.out.println();
    }
}
