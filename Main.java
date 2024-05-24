public class Main {
    public static void main(String[] args) {
        Kategory kategoryApples = new Kategory();
        Kategory kategoryPhones = new Kategory();
        Kategory kategory = new Kategory();
        Basket bsk = new Basket();
        Product product = new Product();
        Product appleRed = new Product("Яблоки Красные", 99, 87);
        Product appleGreen = new Product("Яблоки Зеленые", 119, 85);
        Product phoneXiaomi = new Product("Redmi Note 9 Pro", 22990, 91);
        Product phoneApple = new Product("Iphone X", 59990, 91);

        String[] apples = new String[2];
        apples[0] = new String(appleRed.getName());
        apples[1] = new String(appleGreen.getName());
        kategoryApples.setProductName("Яблоки");
        kategoryApples.setProducts(apples);

        String[] phones = new String[2];
        phones[0] = new String(phoneXiaomi.getName());
        phones[1] = new String(phoneApple.getName());
        kategoryPhones.setProductName("Телефоны");
        kategoryPhones.setProducts(phones);

        User nike = new User();
        nike.setLogin(nike.getLogin());
        nike.setPassword(nike.getPassword());
        nike.setCustomerBasket(new Basket(apples));
        System.out.println(nike);
        nike.getCustomerBasket().getBuyProducts().toString();

        User adidas = new User("Adidas001", "ad1das", new Basket());
        adidas.setCustomerBasket(new Basket(apples));
        System.out.println(adidas);

        product.productCatalog(phoneXiaomi.getName(), phoneApple.getName());
        kategory.kategoryCatalog(kategoryApples.getProductName(), kategoryPhones.getProductName());

    }
}
