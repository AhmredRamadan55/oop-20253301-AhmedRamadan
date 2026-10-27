import java.util.Scanner;

public class Question2 {
    public static double coneVolume(double dValue, double hValue) {
        double radius = dValue / 2.0;
        return (1.0 / 3.0) * Math.PI * radius * radius * hValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter diameter: ");
        double diameter = input.nextDouble();
        System.out.print("Enter height: ");
        double height = input.nextDouble();

        double volume = coneVolume(diameter, height);
        System.out.printf("Volume: %.2f%n", volume);
        input.close();
    }
}
