import java.util.Scanner;

public class Question2 {
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("[, ]+");

        System.out.print("Enter x1, y1, x2, y2: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.printf("Distance: %.2f%n", calculateDistance(x1, y1, x2, y2));

        input.close();
    }
}
