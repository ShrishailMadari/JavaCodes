package SolidPrinciples.dependencyinversion;
interface PaymentMethod {
    void pay(int amount);
}
class PhonePay implements PaymentMethod{

    @Override
    public void pay(int amount) {
        System.out.println("payment through Phone pay");
    }
}
class PayPal implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}
class CreditCard implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
class PaymentServiceAfterDIP {
    private PaymentMethod paymentMethod;
    public PaymentServiceAfterDIP(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
        System.out.println("payment successfully");
    }

    public void processPayment(int amount) {
        paymentMethod.pay(amount);
    }
}
public class AfterDIP {
    public static void main(String[] args) {
        PhonePay phonePay = new PhonePay();
        PaymentServiceAfterDIP paymentServiceAfterDIP = new PaymentServiceAfterDIP(phonePay);
        paymentServiceAfterDIP.processPayment(100);
    }
}
