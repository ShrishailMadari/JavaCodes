package lambdaexpressions;
interface Shape{
   void draw();
}
class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("rectangular in shape: draw( ) ");
    }
}
class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("square in shape: square( )");
    }
}
class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("circle in shape:");
    }

}
public class LambdaExpressions {
    public static void main(String[] args) {
        Shape rectangle = ()-> System.out.println("rectangular in shape: draw()");
        Shape square = ()-> System.out.println("square in shape: square()");
        Shape circle = ()-> System.out.println("circle in shape: circle()");
        /*calling the main method using the variable of LE*/
       /* rectangle.draw();
        square.draw();
        circle.draw();*/

        /*passing the LE as Method Parameter*/
//        print(rectangle);
//        print(square);
//        print(circle);

        //we can pass the expression directly is called behavior to the method
        print(()-> System.out.println("rectangular in shape: draw()"));
        print(()-> System.out.println("square in shape: square()"));
        print(()-> System.out.println("circle in shape: circle()"));
    }
    /*L.E as method parameter*/
    public static void print(Shape shape){
        shape.draw();
    }

}
