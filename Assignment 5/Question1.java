import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[6];

        System.out.print("Enter 6 numbers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        System.out.print("Reverse: ");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
        System.out.println();

        int sumOfEvenNumbers = 0;
        for (int number : nums) {
            if (number % 2 == 0) {
                sumOfEvenNumbers += number;
            }
        }
        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);

        int greaterThanFirst = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[0]) {
                greaterThanFirst++;
            }
        }
        System.out.println("Greater than the first number: " + greaterThanFirst);

        input.close();
    }
}
