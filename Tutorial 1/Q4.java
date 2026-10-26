import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a two-digit number: ");
        int n = input.nextInt();

        int tens = n / 10;
        int ones = n % 10;
        int sum = tens + ones;

        System.out.println("Tens: " + tens);
        System.out.println("Ones: " + ones);
        System.out.println("Sum: " + sum);
    }
}
