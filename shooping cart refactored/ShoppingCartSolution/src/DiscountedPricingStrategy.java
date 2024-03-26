import java.util.List;

class DiscountedPricingStrategy implements PricingStrategy {
    @Override
    public double calculateTotalCost(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            if (item.isDiscounted()) {
                total += item.getPrice() * 0.8;
            } else {
                total += item.getPrice();
            }
        }
        if (total > 100) {
            total -= 10;
        }
        return total;
    }
}