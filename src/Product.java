public class Product {
    private String name;
    private double price;
    private String producer;

    public Product(String name, double price, String producer) {
        this.name = name;
        this.price = price;
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return  name + " " + price + "zł " + producer;
    }
}
