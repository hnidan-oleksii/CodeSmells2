package Part3.Task7;

public class Customer {
    private Address address;

    // Конструктор
    public Customer(Address address) {
        this.address = address;
    }

    // Геттер для адреси
    public Address getAddress() {
        if (address == null) {
            return new NullAddress(); // Повертаємо Null-об'єкт
        }
        return address;
    }
}

