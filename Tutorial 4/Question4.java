import java.util.Scanner;

public class Question4 {
    public static String extractDomain(String email) {
        email = email.trim();
        int atIndex = email.indexOf('@');

        if (atIndex == -1) {
            return "Invalid Email";
        }

        return email.substring(atIndex + 1).toLowerCase();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = input.nextLine();

        System.out.println(extractDomain(email));
        input.close();
    }
}
