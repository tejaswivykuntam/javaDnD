public class PetrolPurchase {
    private String location;
    private String type;
    private int quantity;
    private double price;
    private double discount;

    public PetrolPurchase(String location, String type, int quantity, double price, double discount) {
        this.location = location;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }   

    public double getDiscount() {
        return discount;
    }

    public String setLocation(String location) {
        return this.location = location;
    }

    public String setType(String type) {
        return this.type = type;
    }

    public int setQuantity(int quantity) {
        return this.quantity = quantity;
    }

    public double setPrice(double price) {
        return this.price = price;
    }

    public double setDiscount(double discount) {
        return this.discount = discount;
    }

    public double getPurchaseAmount() {
        return (quantity * price) - (quantity * price * discount);
    }
}
