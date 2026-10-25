import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number");
        } else {
            int sum = 0;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }

            if (sum == n) {
                System.out.println("Perfect number");
            } else {
                System.out.println("Not a perfect number");
            }
        }

        input.close();
    }
}
