import java.util.List;

class RegularPricingStrategy implements PricingStrategy {
    @Override
    public double calculateTotalCost(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}