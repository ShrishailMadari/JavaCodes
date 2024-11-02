package SolidPrinciples.dependencyinversion;
class CreditCardPayment {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PaymentService {
    private CreditCardPayment creditCardPayment;
//assigning the object of dependent class directly, which creates tight coupling
    //Super class directly depending on subclass,
    //high module depends on low level module
    public PaymentService() {
        this.creditCardPayment = new CreditCardPayment();
    }

    public void processPayment(int amount) {
        creditCardPayment.pay(amount);
    }
}

public class BeforeDIP {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment(100);
    }
}
