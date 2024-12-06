package thread;
class MyThreadOne implements Runnable{

    @Override
    public void run() {
        for (int i=1; i<=20; i++){
            System.out.println(i);
        }

    }
}
class MyThreadTwo extends Thread{
    public void run(){
        for (int i=1; i<=10;i++){
            System.out.println(i*5);
        }
    }

}
public class MyThread {
    public static void main(String[] args) {
        MyThreadOne myThreadOne = new MyThreadOne();
//        Thread thread = new Thread(myThreadOne);
//        thread.start();

        MyThreadTwo myThreadTwo = new MyThreadTwo();
        myThreadTwo.start();

    }
}
