package SolidPrinciples.srp.after;
// 1. Class for Invoice Data
class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

// 2. Class for Invoice Calculation
class InvoiceCalculator {
    public double calculateTotal(Invoice invoice) {
        return invoice.getAmount() * 1.18;  // Assuming 18% tax
    }
}

// 3. Class for Printing the Invoice
class InvoicePrinter {
    public void printInvoice(Invoice invoice, double total) {
        System.out.println("Invoice Amount: " + invoice.getAmount());
        System.out.println("Total with Tax: " + total);
    }
}

// 4. Class for Database Operations
class InvoiceRepository {
    public void saveToDatabase(Invoice invoice) {
        // Logic to save invoice in database
        System.out.println("Invoice saved to database.");
    }
}

public class AfterSRP {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(1000);
        InvoiceCalculator calculator = new InvoiceCalculator();
        InvoicePrinter printer = new InvoicePrinter();
        InvoiceRepository repository = new InvoiceRepository();

        double total = calculator.calculateTotal(invoice);
        printer.printInvoice(invoice, total);
        repository.saveToDatabase(invoice);
    }
}
