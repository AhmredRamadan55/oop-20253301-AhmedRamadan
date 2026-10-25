import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        while (true) {
            n = input.nextInt();

            if (n == 0) {
                break;
            }

            if (n < 0) {
                continue;
            }

            if (n > largest) {
                largest = n;
            }

            if (n < smallest) {
                smallest = n;
            }

            sum += n;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;

            System.out.println(largest);
            System.out.println(smallest);
            System.out.println(average);
        }

        input.close();
    }
}
