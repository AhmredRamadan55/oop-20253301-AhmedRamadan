import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computer = (int)(Math.random() * 5) + 1;

        System.out.print("Enter your guess (1-5): ");
        int guess = input.nextInt();

        if (guess == computer) {
            System.out.println("Correct!");
        } else if (guess < computer) {
            System.out.println("Too low");
        } else {
            System.out.println("Too high");
        }

        System.out.println("Computer chose: " + computer);
    }
}
