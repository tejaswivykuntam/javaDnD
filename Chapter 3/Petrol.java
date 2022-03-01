public class Petrol {
    

    public static void main(String[] args) {
        PetrolPurchase petrolPurchase = new PetrolPurchase("London", "Diesel", 10, 1.50, 0.10);
        System.out.println("Petrol purchase details: " + petrolPurchase.getLocation() + " " + petrolPurchase.getType() + " " + petrolPurchase.getQuantity() + " " + petrolPurchase.getPrice() + " " + petrolPurchase.getDiscount());
        System.out.println("Petrol purchase amount: " + petrolPurchase.getPurchaseAmount());
    }
}
