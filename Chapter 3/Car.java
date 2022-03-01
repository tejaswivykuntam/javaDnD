public class Car {
    
    private String model;
    private String year;
    private Double price;

    public Car(String model, String year, Double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }
    
    public String getYear() {
        return year;
    }

    public Double getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPrice(Double price) {
        if(price < 0) {
            System.out.println("Price cannot be negative");
        } else {
            this.price = price;
        }
    }
}
