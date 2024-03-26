import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    // Constructor
    public ShoppingCart(List<Item> items) {
        this.items = items;
    }
    public double calculateTotalCost() {
        double total = 0;
        for (Item item : items) {   
            if (item.isDiscounted()) 
            {
                total += item.getPrice() * 0.8;
            } 
            else {
                total += item.getPrice();
            }
    }
    
    if (total > 100) {
        total -= 10;
    }
        return total;
    }
}