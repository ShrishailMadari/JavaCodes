package hirarchical;

public class Testing {
    public static void main(String[] args) {
        System.out.println("hirarchical in heritance");
        var vehicle = new vehicle();
        System.out.println(vehicle.brand);
        Car car = new Car();
        car.start();
        System.out.println(car.price);
        Bike bike = new Bike();
        bike.stop();
        System.out.println(bike.fuel);
    }
}
