package Part3.Task2;

public class Class {
    public void processPayment(double amount, boolean isMember, boolean
            isDiscountAvailable) {
        if ((amount > 100 && isMember)
                || (amount > 200 && isDiscountAvailable)) {
            applyDiscount();
        }
    }
}
