import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double unitPrice;

    public Product(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}

class LineItem {
    private Product product;
    private int quantity;

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return product.getUnitPrice() * quantity;
    }
}

class Invoice {
    private String title;
    private String customerAddress;
    private List<LineItem> lineItems;

    public Invoice(String title, String customerAddress) {
        this.title = title;
        this.customerAddress = customerAddress;
        this.lineItems = new ArrayList<>();
    }

    public void addLineItem(LineItem item) {
        lineItems.add(item);
    }

    public double getTotalAmountDue() {
        double total = 0;
        for (LineItem item : lineItems) {
            total += item.getTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n");
        sb.append(customerAddress).append("\n\n");
        for (LineItem item : lineItems) {
            sb.append("Item: ").append(item.getProduct().getName()).append("\n");
            sb.append("Quantity: ").append(item.getQuantity()).append("\n");
            sb.append("Price: $").append(item.getProduct().getUnitPrice()).append("\n");
            sb.append("Total: $").append(item.getTotal()).append("\n\n");
        }
        sb.append("Total Amount Due: $").append(getTotalAmountDue());
        return sb.toString();
    }
}

