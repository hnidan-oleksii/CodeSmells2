package Part2.Task2;

public class CustomerOrder {
    private String customer;
    private double amount;

    // Конструктор
    public CustomerOrder(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    // Геттер для імені покупця
    public String getCustomer() {
        return customer;
    }

    // Сеттер для імені покупця
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    // Геттер для суми замовлення
    public double getAmount() {
        return amount;
    }

    // Сеттер для суми замовлення
    public void setAmount(double amount) {
        this.amount = amount;
    }
}

