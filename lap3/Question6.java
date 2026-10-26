import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest = 0;
        int n;

        while (true) {
            n = input.nextInt();

            if (n == 0) {
                break;
            }

            if (n > largest) {
                largest = n;
            }
        }

        System.out.println(largest);

        input.close();
    }
}
