package jom.com.softserve.s1.task3;

public class Product {
    static int counts = 0;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        counts++;
    }

    public Product() {
        counts++;
    }

    public static int count() {
        return counts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}