package Part3.Task5;

public class Class {
    public void processOrder(int quantity, double price) {
        if (quantity <= 0) {
            System.out.println("Invalid quantity");
        }

        if (price > 0) {
            // Основна логіка
            System.out.println("Order processed successfully");
        } else {
            System.out.println("Invalid price");
        }
    }
}
