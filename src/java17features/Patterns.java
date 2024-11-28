package java17features;
class Shape{
    private int height;
    private double width;

    public Shape() {
    }

    public Shape(int height, double width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
public class Patterns {
    public static void main(String[] args) {
        guardedPatterns(new Shape());
    }

    private static void guardedPatterns(Shape shape) {
        switch (shape){
            case Shape s1 when shape.getHeight()<10 -> System.out.println(s1.getHeight());
            case Shape s2 when shape.getWidth()>20-> System.out.println(s2.getWidth());
            default -> throw new IllegalStateException("Unexpected value: " + shape);
        }

    }
}
