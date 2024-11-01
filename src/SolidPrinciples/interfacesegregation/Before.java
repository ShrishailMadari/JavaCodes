package SolidPrinciples.interfacesegregation;
// A "fat" interface

class OfficeWorkerBefore implements Worker {
    @Override
    public void work() {
        System.out.println("Office worker is working.");
    }

    @Override
    public void eat() {
        System.out.println("Office worker is eating.");
    }
}

class RobotWorkerBefore implements Worker {
    @Override
    public void work() {
        System.out.println("Robot worker is working.");
    }

    @Override
    public void eat() {
        // Robots don’t eat, so this method is irrelevant for RobotWorker
        throw new UnsupportedOperationException("Robot cannot eat.");
    }
}

public class Before {
    public static void main(String[] args) {
        OfficeWorkerBefore officeWorker = new OfficeWorkerBefore();
        officeWorker.eat();
        officeWorker.work();
        RobotWorkerBefore robotWorker = new RobotWorkerBefore();
        try {
            robotWorker.eat();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        robotWorker.work();
    }
}
