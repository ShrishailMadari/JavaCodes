package SolidPrinciples.ocp;
// Shape interface that all shapes will implement

// Rectangle class implementing Shape
class RectangleAfterOCP implements Shape {
    private double width;
    private double height;

    public RectangleAfterOCP(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

class CircleAfterOCP implements Shape {
    private double radius;

    public CircleAfterOCP(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}



// Circle class implementing Shape

// AreaCalculator class using the Shape interface
class AreaCalculatorAfterOCP {
    public double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }
}


public class AfterOCP {

    public static void main(String[] args) {
        // Create an array of Shape
        Shape[] shapes = new Shape[3];
        shapes[0] = new RectangleAfterOCP(2.5,5);
        shapes[1] = new Triangle(5.5,10.0);
        shapes[2] = new CircleAfterOCP(4.5);
        AreaCalculatorAfterOCP areaCalculator   = new AreaCalculatorAfterOCP();
        double d = areaCalculator.calculateTotalArea(shapes);
        System.out.println(d);
    }

}
