package SolidPrinciples.ocp;
class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }
}

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class AreaCalculator {
    public double calculateTotalArea(Object[] shapes) {
        double totalArea = 0;
        for (Object shape : shapes) {
            if (shape instanceof Rectangle) {
                totalArea += ((Rectangle) shape).area();
            } else if (shape instanceof Circle) {
                totalArea += ((Circle) shape).area();
            }
            // Add more else-if blocks for each new shape
        }
        return totalArea;
    }
}


public class Before {
    public static void main(String[] args) {
        // Create instances of Rectangle and Circle
        Rectangle rectangle = new Rectangle(5, 4);  // Width = 5, Height = 4
        Circle circle = new Circle(3);               // Radius = 3

        // Create an array of shapes (Object[])
        Object[] shapes = new Object[2];
        shapes[0] = rectangle; // Add Rectangle
        shapes[1] = circle;    // Add Circle

        // Create an instance of AreaCalculator
        AreaCalculator calculator = new AreaCalculator();

        // Calculate total area
        double totalArea = calculator.calculateTotalArea(shapes);
        System.out.println("Total Area: " + totalArea);
    }
}
