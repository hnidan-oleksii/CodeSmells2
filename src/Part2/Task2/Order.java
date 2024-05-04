package Part2.Task2;

public class Order {
    private CustomerOrder customerOrder;

    // Конструктор
    public Order(String customer, double amount) {
        this.customerOrder = new CustomerOrder(customer, amount);
    }

    // Делегування методів до класу CustomerOrder
    public String getCustomer() {
        return customerOrder.getCustomer();
    }

    public void setCustomer(String customer) {
        customerOrder.setCustomer(customer);
    }

    public double getAmount() {
        return customerOrder.getAmount();
    }

    public void setAmount(double amount) {
        customerOrder.setAmount(amount);
    }

    // Інші методи класу...
}
