import java.util.Scanner;

public class Main {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter number to check if divisible by 3 or 5 or both: ");
int number = input.nextInt();
if (number % 3 == 0 && number % 5 == 0) {
System.out.println("Divisible by 3 and 5");
} else if (number % 3 == 0) {
System.out.println("Divisible by 3");
} else if (number % 5 == 0) {
System.out.println("Divisible by 5");
} else {
System.out.println("Not Divisible by 3 or 5");
}
}
}
