import java.util.Scanner;

public class Question4 {
    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }

        int digitCount = 0;
        boolean hasUppercase = false;

        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);

            if (!Character.isLetterOrDigit(character)) {
                return false;
            }

            if (Character.isDigit(character)) {
                digitCount++;
            }

            if (Character.isUpperCase(character)) {
                hasUppercase = true;
            }
        }

        return digitCount >= 2 && hasUppercase;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

        input.close();
    }
}
