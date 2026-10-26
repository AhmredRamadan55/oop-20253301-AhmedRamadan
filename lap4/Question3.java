public class Question3 {
    public static double computeArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double computeArea(double length, double width) {
        return length * width;
    }

    public static double computeArea(double base, double height, boolean isTriangle) {
        if (!isTriangle) {
            throw new IllegalArgumentException("isTriangle must be true for a triangle.");
        }

        return base * height / 2.0;
    }

    public static void main(String[] args) {
        System.out.println("Circle Area = " + computeArea(5.0));
        System.out.println("Rectangle Area = " + computeArea(4.0, 6.0));
        System.out.println("Triangle Area = " + computeArea(4.0, 6.0, true));
    }
}
