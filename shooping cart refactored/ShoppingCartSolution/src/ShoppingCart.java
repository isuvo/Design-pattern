import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    private PricingStrategy pricingStrategy;

    public ShoppingCart(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotalCost() {
        return pricingStrategy.calculateTotalCost(items);
    }
}