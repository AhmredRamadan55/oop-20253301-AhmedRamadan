import java.util.Scanner;


public class Problem4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 4-digit number: ");
        int n = input.nextInt();

        int thousands = n / 1000;
        int hundreds = (n / 100) % 10;
        int tens = (n / 10) % 10;
        int ones = n % 10;
        int sum = thousands + hundreds + tens + ones;

        System.out.println("Thousands: " + thousands);
        System.out.println("Hundreds: " + hundreds);
        System.out.println("Tens: " + tens);
        System.out.println("Ones: " + ones);
        System.out.println("Digit sum: " + sum);

    }
}
