class Invoice {
    private int invoiceID;
    private double discount;
    private double totalInvoice;

    public Invoice() {
        this(1, 2.5, 100.0);
    }

    public Invoice(int invoiceID, double discount, double totalInvoice) {
        this.invoiceID = invoiceID;
        this.discount = discount;
        this.totalInvoice = totalInvoice;
    }

    public int getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotalInvoice() {
        return totalInvoice;
    }

    public void setTotalInvoice(double totalInvoice) {
        this.totalInvoice = totalInvoice;
    }

    public double calculateDiscountPrice() {
        return totalInvoice - (totalInvoice * discount / 100.0);
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        printInvoice(invoice);

        invoice.setDiscount(5.5);
        invoice.setTotalInvoice(200.0);
        printInvoice(invoice);
    }

    private static void printInvoice(Invoice invoice) {
        System.out.println(invoice.getInvoiceID() + " " + invoice.getDiscount()
                + " Before discount: " + invoice.getTotalInvoice()
                + " After discount: " + invoice.calculateDiscountPrice());
    }
}
