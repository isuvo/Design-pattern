public class DiscountedItem extends Item {
    public DiscountedItem(double price) {
        // Discounted items are always marked as discounted
        super(price, true); 
    }
}
