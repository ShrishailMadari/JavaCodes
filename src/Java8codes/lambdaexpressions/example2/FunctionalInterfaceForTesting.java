package Java8codes.lambdaexpressions.example2;

public class FunctionalInterfaceForTesting implements CalciiOperations{
    public static void main(String[] args) {

        CalciiOperations calciiOperations = ((x, y) -> {
            System.out.println("values are "+x +" , "+y);
            return x+y;

        });
        //executing lambda expressions
        double d = calciiOperations.operation(1.5,10.7);
        System.out.println(d);

        CalciiOperations c = (p,q)->{
            System.out.println(p+" "+q);
            return p-q;
        };
        double z = c.operation(10,20);
        System.out.println(z);

        CalciiOperations calci = (m,n)-> m*n;
        double x = calci.operation(2,7);
        System.out.println(x);
    }
    @Override
    public double operation(double a, double b) {
        return 0;
    }
}
