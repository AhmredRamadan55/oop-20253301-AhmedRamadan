import java.util.Scanner;


class Test {

    public static void main(String[] args) {
        System.out.println("enter Unit price:");
        Scanner input=new Scanner(System.in);
        double unitPrice=input.nextDouble();
        System.out.println("enter Quantity:");
        int quantity=input.nextInt();
        double subtotal = unitPrice * quantity;
        final double TAX_RATE = 0.14;
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;
       System.out.printf("Subtotal = %.2f%n", subtotal);
       System.out.printf("Tax = %.2f%n", tax);
       System.out.printf("Total = %.2f%n", total);
    }
}
