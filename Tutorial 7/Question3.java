import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this("", "", 0.0);
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void applyDiscount(double percentage) {
        price -= price * percentage / 100.0;
    }

    public boolean isExpensive() {
        return price > 500.0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int numberOfBooks = input.nextInt();
        input.nextLine();

        if (numberOfBooks <= 0) {
            System.out.println("The number of books must be positive.");
            input.close();
            return;
        }

        Book[] books = new Book[numberOfBooks];
        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter information for book " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = input.nextLine();
            System.out.print("Author: ");
            String author = input.nextLine();
            System.out.print("Price: ");
            double price = input.nextDouble();
            input.nextLine();

            books[i] = new Book(title, author, price);
        }

        System.out.print("Enter the index of the book to discount (0 to "
                + (books.length - 1) + "): ");
        int index = input.nextInt();
        System.out.print("Enter the discount percentage: ");
        double percentage = input.nextDouble();
        books[index].applyDiscount(percentage);

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println("\nBook " + (i + 1) + ":");
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Price: " + book.getPrice());
            System.out.println("Expensive: " + book.isExpensive());
        }

        input.close();
    }
}
