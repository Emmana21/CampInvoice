import javax.swing.*;

public class InvoiceGui {
    public static void main(String[] args) {
        // Create products
        Product toaster = new Product("Toaster", 29.95);
        Product hairDryer = new Product("Hair Dryer", 24.95);
        Product carVacuum = new Product("Car Vacuum", 19.99);

        // Create line items
        LineItem item1 = new LineItem(toaster, 3);
        LineItem item2 = new LineItem(hairDryer, 1);
        LineItem item3 = new LineItem(carVacuum, 2);

        // Create invoice
        Invoice invoice = new Invoice("Sams small appliances", "100 Main St., Anytown, CA 98765");
        invoice.addLineItem(item1);
        invoice.addLineItem(item2);
        invoice.addLineItem(item3);

        // Print invoice details
        System.out.println(invoice.toString());
    }
}
