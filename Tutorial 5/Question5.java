import java.util.Scanner;

public class Question5 {
    public static boolean isStrong(String pw) {
        return pw.length() >= 6
                && Character.isUpperCase(pw.charAt(0))
                && pw.indexOf('@') != -1;
    }

    public static String mask(String pw) {
        if (pw.isEmpty()) {
            return "";
        }

        String masked = String.valueOf(pw.charAt(0));
        for (int i = 1; i < pw.length(); i++) {
            masked = masked.concat("*");
        }
        return masked;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] passwords = new String[4];

        System.out.print("Enter 4 passwords: ");
        for (int i = 0; i < passwords.length; i++) {
            passwords[i] = input.next();
        }

        for (int i = 0; i < passwords.length; i++) {
            String strength = isStrong(passwords[i]) ? "Strong" : "Weak";
            System.out.println("Password " + (i + 1) + ": " + strength
                    + " (" + mask(passwords[i]) + ")");
        }

        input.close();
    }
}
