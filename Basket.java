import java.util.Arrays;
import java.util.List;

public class Basket implements AddDelete {
    private String[] buyProducts;
//    private List<String> buyProducts;

    public String[] getBuyProducts() {
        return buyProducts;
    }

    public void setBuyProducts(String[] buyProducts) {
        this.buyProducts = buyProducts;
    }

    public Basket() {
    }

    public Basket(String[] buyProducts) {
        this.buyProducts = buyProducts;
    }

    @Override
    public String toString() {
        return "Корзина продуктов.\n" +
                "Купленные продукты: " + Arrays.toString(buyProducts);
    }

    @Override
    public boolean add(Product product) {
//        если позже добавить функционал с количеством товара
//        if (product.isEmpty())
//            return false;
//        if (products.containsKey(product.getName())) {
//            Product old = products.get(product.getName());
//            old.setAmount(old.getAmount() + product.getAmount());
//            products.replace(product.getName(), old);
//        } else
//            products.put(product.getName(), product);
        return true;
    }

    @Override
    public boolean delete(Product product) {
//        если позже добавить функционал с количеством товара
//        if (product.isEmpty())
//            return false;
//        if (products.containsKey(product.getName())) {
//            Product old = products.get(product.getName());
//            int diff = old.getAmount() - product.getAmount();
//            old.setAmount((diff >= 0) ? diff : 0);
//            if (old.getAmount() != 0)
//                products.replace(product.getName(), old);
//            else
//                products.remove(product.getName());
//            return true;
//        } else
        return false;
    }
}
