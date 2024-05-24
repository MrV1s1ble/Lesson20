import java.util.Arrays;

public class Kategory {
    private String kategoryName;
    private String[] products;
//    private List<String> products;


    public void kategoryCatalog(String categoryName1, String categoryName2) {
        System.out.println(categoryName1 + " " + categoryName2);
    }

    public Kategory() {
    }

    public Kategory(String productName, String[] products) {
        this.kategoryName = productName;
        this.products = products;
    }

    public String getProductName() {
        return kategoryName;
    }

    public void setProductName(String productName) {
        this.kategoryName = productName;
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Категория: " + kategoryName +
                ", Продукты: " + Arrays.toString(products) +
                '.';
    }
}
