import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        List<Item> items = new ArrayList<>();
        items.add(new Item(50, false)); // A regular item priced at 50
        items.add(new DiscountedItem(60)); // A discounted item priced at 60
        
        ShoppingCart cart = new ShoppingCart(items);
        double totalCost = cart.calculateTotalCost();
        System.out.println("Total Cost: " + totalCost);

    }
}
