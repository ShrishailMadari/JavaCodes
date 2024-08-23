package lambdaexpressions;
interface MathExpression{
    int addition(int a, int b);
}
class Addition implements MathExpression{

    @Override
    public int addition(int a, int b) {
        return (a+b);
    }
}
public class LambdaExpressionWithParameters {
    public static void main(String[] args) {
        MathExpression expression = (int a,int b)-> (a+b);
        System.out.println( expression.addition(10,20));
//        mathExpression((int a,int b)-> (a+b));

        MathExpression mathExpression = (int a,int b)->
        {
            int c = (a+b);
            return c;
        };
        int c= mathExpression.addition(100,200);
        System.out.println(c);
    }
    public static void mathExpression(MathExpression expression){
        System.out.println(expression.addition(10,20));
    }
}
