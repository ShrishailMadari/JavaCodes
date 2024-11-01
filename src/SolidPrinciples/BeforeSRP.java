package SolidPrinciples;
class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    // 1. Calculate the total with tax
    public double calculateTotal() {
        return amount * 1.18;  // Assuming 18% tax
    }

    // 2. Print the invoice
    public void printInvoice() {
        System.out.println("Invoice Amount: " + amount);
        System.out.println("Total with Tax: " + calculateTotal());
    }

    // 3. Save the invoice to the database
    public void saveToDatabase() {
        // Logic to save invoice in database
        System.out.println("Invoice saved to database.");
    }
}

public class BeforeSRP {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(28.0);
        System.out.println(invoice.calculateTotal());
        System.out.println();
        invoice.printInvoice();
        System.out.println();
        invoice.saveToDatabase();

    }

}
