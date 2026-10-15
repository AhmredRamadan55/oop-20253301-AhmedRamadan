import java.util.Scanner;


public class Problem3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = input.nextInt();
        System.out.print("Enter y: ");
        int y = input.nextInt();

        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swap: x = " + x + ", y = " + y);

    }
}
