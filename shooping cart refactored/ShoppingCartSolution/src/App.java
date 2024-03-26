public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        ShoppingCart cart = new ShoppingCart(new DiscountedPricingStrategy());
        cart.addItem(new Item(60.0, true));
        cart.addItem(new Item(50.0, false));
        double totalCost = cart.calculateTotalCost();
        System.out.println("Total cost: $" + totalCost);
    }
}
