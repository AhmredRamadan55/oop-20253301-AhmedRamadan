import java.util.Scanner;

public class Question1 {
    public static int getInt(Scanner s, String prompt) {
        System.out.print(prompt);
        return s.nextInt();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age = getInt(input, "Enter your age: ");
        System.out.println("Recorded Age: " + age);

        input.close();
    }
}
