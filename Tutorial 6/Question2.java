import java.util.Scanner;

class CashRegister {
    private int itemCount;
    private double totalPrice;

    public CashRegister() {
        this(0, 0.0);
    }

    public CashRegister(int itemCount, double totalPrice) {
        this.itemCount = itemCount;
        this.totalPrice = totalPrice;
    }

    public void addItem(double price) {
        itemCount++;
        totalPrice += price;
    }

    public void clear() {
        itemCount = 0;
        totalPrice = 0.0;
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CashRegister register = new CashRegister();

        System.out.print("Item 1: ");
        register.addItem(input.nextDouble());

        System.out.print("Item 2: ");
        register.addItem(input.nextDouble());

        System.out.println("Count is: " + register.getItemCount());
        System.out.printf("Total is: %.2f%n", register.getTotalPrice());

        register.clear();
        System.out.printf("After clear, the total = %.2f and count = %d%n",
                register.getTotalPrice(), register.getItemCount());

        input.close();
    }
}
