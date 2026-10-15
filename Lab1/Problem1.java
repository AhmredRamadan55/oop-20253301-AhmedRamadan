import java.util.Scanner;


public class Problem1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.printf("The converted temperature = %.1f F", fahrenheit);


    }
}
