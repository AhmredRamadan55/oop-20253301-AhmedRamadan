import java.util.Scanner;

public class Main {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a character: ");
char ch = input.next().charAt(0);
if ((ch >= '0' && ch <= '9')) {
System.out.println("Digit");
} else if ((ch >= 'A' && ch <= 'Z') ||
(ch >= 'a' && ch <= 'z')) {
System.out.println("Letter");
} else {
System.out.println("Other");
}
}
}
