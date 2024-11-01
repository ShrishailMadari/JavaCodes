package SolidPrinciples.interfacesegregation;
// Split interfaces
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

// OfficeWorker needs both work and eat capabilities
class OfficeWorker implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Office worker is working.");
    }

    @Override
    public void eat() {
        System.out.println("Office worker is eating.");
    }
}

// RobotWorker only needs work capability, not eat
class RobotWorker implements Workable {
    @Override
    public void work() {
        System.out.println("Robot worker is working.");
    }
}

public class AfterISP {
    public static void main(String[] args) {
        RobotWorker robotWorker = new RobotWorker();
        robotWorker.work();
        OfficeWorker officeWorker = new OfficeWorker();
        officeWorker.work();
        officeWorker.eat();
    }
}
