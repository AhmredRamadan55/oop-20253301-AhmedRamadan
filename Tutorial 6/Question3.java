class Rectangle {
    private double width;
    private double length;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}

public class Question3 {
    public static void main(String[] args) {
        Rectangle first = new Rectangle();
        Rectangle second = new Rectangle(5.0, 10.0);

        System.out.println("Results of the first Object");
        printRectangle(first);

        System.out.println("\nResults of the Second Object");
        printRectangle(second);
    }

    private static void printRectangle(Rectangle rectangle) {
        System.out.println("The length = " + rectangle.getLength());
        System.out.println("The width = " + rectangle.getWidth());
        System.out.println("Area = " + rectangle.getArea()
                + " Perimeter = " + rectangle.getPerimeter());
    }
}
