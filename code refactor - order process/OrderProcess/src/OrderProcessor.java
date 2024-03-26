public class OrderProcessor 
{
    private double[] itemsCost;
    private double taxRate;    

    public OrderProcessor(double[] itemsCost, double taxRate) 
    {
        this.itemsCost = itemsCost;
        this.taxRate = taxRate;
    }
    public void processOrder() 
    {
        double subtotal = calculateSubtotal();
        double tax = calculateTax(subtotal);
        double total = calculateTotal(subtotal, tax);
        // Output results
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }
    private double calculateSubtotal() 
    {
        double subtotal = 0;
        for (double cost : itemsCost) {
        subtotal += cost;
    }
    return subtotal;
    }
    private double calculateTax(double subtotal) 
    {
        return subtotal * taxRate;
    }

    private double calculateTotal(double subtotal, double tax) 
    {
        return subtotal + tax;
    }
}
