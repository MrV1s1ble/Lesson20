import java.util.Objects;

public class User implements InsertSmt{

    private String login;
    private String password;
    private Basket customerBasket;

    public String getLogin() {
        return insertSmt();
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return insertSmt();
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getCustomerBasket() {
        return customerBasket;
    }

    public void setCustomerBasket(Basket customerBasket) {
        this.customerBasket = customerBasket;
    }

    public User() {
    }

    public User(String login, String password, Basket customerBasket) {
        this.login = login;
        this.password = password;
        this.customerBasket = customerBasket;
    }

    @Override
    public String toString() {
        return "Клиент: " +
                "Логин: " + login +
                ",\nПароль: " + password +
                ",\nКорзина: " + customerBasket +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(login, user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(login);
    }
}
