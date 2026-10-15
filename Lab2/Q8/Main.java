import java.util.Scanner;

public class Main {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter three integers: ");
int a = input.nextInt();
int b = input.nextInt();
int c = input.nextInt();
if (a == b && b == c) {
System.out.println("All equal");
} else if (a == b || a == c || b == c) {
System.out.println("Two numbers are equal");
} else {
System.out.println("All different");
}
}
}
