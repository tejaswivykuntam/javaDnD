public class CarApplication {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "2018", 20000.00);
        Car car2 = new Car("BMW", "2019", 30000.00);
        
        System.out.println("Car1 details: " + car1.getModel() + " " + car1.getYear() + " " + car1.getPrice());
        System.out.println("Car2 details: " + car2.getModel() + " " + car2.getYear() + " " + car2.getPrice());

        System.out.println("Car1 price with 5% discount: " + car1.getPrice() * 0.95);
        System.out.println("Car2 price with 7% discount: " + car2.getPrice() * 0.93);
    }
}