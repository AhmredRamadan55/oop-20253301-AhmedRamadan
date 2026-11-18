import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] sales = new int[7];
        int total = 0;
        int daysGreaterThan20 = 0;

        System.out.print("Enter sales of 7 days: ");
        for (int i = 0; i < sales.length; i++) {
            sales[i] = input.nextInt();
            total += sales[i];
            if (sales[i] > 20) {
                daysGreaterThan20++;
            }
        }

        long average = Math.round((double) total / sales.length);

        System.out.println("Total: " + total);
        System.out.println("Days greater than 20: " + daysGreaterThan20);
        System.out.println("Average: " + average);

        input.close();
    }
}
