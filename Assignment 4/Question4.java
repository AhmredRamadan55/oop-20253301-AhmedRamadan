import java.util.Scanner;

public class Question4 {
    public static String maskEmail(String email) {
        email = email.trim();
        int atIndex = email.indexOf('@');

        if (atIndex == -1) {
            return "Invalid Email";
        }

        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1).toLowerCase();

        if (username.length() <= 2) {
            return username + "@" + domain;
        }

        StringBuilder maskedUsername = new StringBuilder(username.substring(0, 2));
        for (int i = 2; i < username.length(); i++) {
            maskedUsername.append('*');
        }

        return maskedUsername.toString() + "@" + domain;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = input.nextLine();

        System.out.println(maskEmail(email));
        input.close();
    }
}
