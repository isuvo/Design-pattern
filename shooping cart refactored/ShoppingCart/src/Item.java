public class Item {
    private double price;
    private boolean isDiscounted;

    public Item(double price, boolean isDiscounted) {
        this.price = price;
        this.isDiscounted = isDiscounted;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscounted() {
        return isDiscounted;
    }
}

