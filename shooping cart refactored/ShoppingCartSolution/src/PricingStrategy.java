import java.util.List;

interface PricingStrategy {
    double calculateTotalCost(List<Item> items);
}

