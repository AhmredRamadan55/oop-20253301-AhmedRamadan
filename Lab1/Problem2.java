import java.util.Scanner;


public class Problem2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total seconds: ");
        int total = input.nextInt();

        int hours = total / 3600;
        int minutes = (total % 3600) / 60;
        int seconds = total % 60;

        System.out.print(total + "seconds = " + hours + "h " + minutes + "min " +
seconds + "s" );


    }
}
