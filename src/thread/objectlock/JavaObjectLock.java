package thread.objectlock;

public class JavaObjectLock {
    public static void main(String[] args) {
        JavaObjectLock javaObjectLock = new JavaObjectLock();
        ThreadOne threadOne = new ThreadOne(javaObjectLock);
        ThreadTwo threadTwo = new ThreadTwo(javaObjectLock);
        threadOne.setName("thread-one");
        threadTwo.setName("thread-two");
        threadOne.start();
        threadTwo.start();

    }
    public synchronized void methodOne(){
        System.out.println("this is method M1"+Thread.currentThread().getName());
    }
    public synchronized void methodTwo(){
        System.out.println("this is method M2"+Thread.currentThread().getName());
    }
}
class ThreadOne extends Thread{
    JavaObjectLock javaObjectLock;
    ThreadOne(JavaObjectLock javaObjectLock){
        this.javaObjectLock = javaObjectLock;
    }

    @Override
    public void run() {
        javaObjectLock.methodOne();
        javaObjectLock.methodTwo();
    }
}
class ThreadTwo extends Thread{
    JavaObjectLock javaObjectLock;
    ThreadTwo(JavaObjectLock javaObjectLock){
        this.javaObjectLock = javaObjectLock;
    }

    @Override
    public void run() {
        javaObjectLock.methodOne();
        javaObjectLock.methodTwo();
    }
}