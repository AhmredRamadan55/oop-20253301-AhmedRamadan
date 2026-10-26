import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        boolean isPrime = n > 1;

        for (int i = 2; isPrime && i <= n / i; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }

        input.close();
    }
}
