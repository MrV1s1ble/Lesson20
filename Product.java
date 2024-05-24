import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int rating;

    public void productCatalog(String productName1, String productName2) {
        System.out.println(productName1 + " " + productName2);
    }

    public Product() {
        this("", 0,0);
    }

    public Product(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public boolean isEmpty() {
        return name.isBlank();
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Продукт: " +
                "название: " + name +
                ", цена: " + price +
                ", рейтинг: " + rating +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(price, product.price) == 0 && rating == product.rating && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, rating);
    }
}
