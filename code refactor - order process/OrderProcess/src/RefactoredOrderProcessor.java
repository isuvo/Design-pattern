import java.util.ArrayList;
import java.util.List;

public class RefactoredOrderProcessor {
    private List<Double> itemsCost;
    private double taxRate;

    public RefactoredOrderProcessor(double[] itemsCost, double taxRate) {
        this.itemsCost = new ArrayList<>();
        for (double cost : itemsCost) {
            this.itemsCost.add(cost);
        }
        this.taxRate = taxRate;
    }
    public void addItem(double itemCost) {
        itemsCost.add(itemCost);
    }
    private double calculateSubtotal() {
        double subtotal = 0;
        for (double cost : itemsCost) {
            subtotal += cost;
        }
        return subtotal;
    }
    private double calculateTax(double subtotal) {
        return subtotal * taxRate;
    }
    private double calculateTotal(double subtotal, double tax) {
        return subtotal + tax;
    }
    private void printOrderDetails(double subtotal, double tax, double total) {
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }
    public void processOrder() {
        double subtotal = calculateSubtotal();
        double tax = calculateTax(subtotal);
        double total = calculateTotal(subtotal, tax);
        printOrderDetails(subtotal, tax, total);
    }

}