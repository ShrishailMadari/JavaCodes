package Java8codes.FunctionalInterfaces.suplier;

import java.util.Date;
import java.util.function.Supplier;

public class Example1 {
    public static void main(String[] args) {

        Supplier<Date> dateSupplier = Date::new;
        System.out.println(dateSupplier.get());

        //getting random OTP
        //6-8 digit
        //by generating the random number from Math.random()
        //from 0<=x<9
       // Math.random() * 10: Generates a random double between 0.0 and 1.0, which is then multiplied by 10 and cast to an integer, giving a range from 0 to 9.
        Supplier<String> supplier = ()->{
            StringBuilder otp = new StringBuilder();
            for(int i=0; i<6; i++){
                otp.append((int) (Math.random() * 10)); // or otp = otp + (int) (Math.random() * 10)
            }
            return otp.toString();
        };
        System.out.println(supplier.get());
    }
}
