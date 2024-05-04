package Part1.Task1;

import java.util.List;

public class Bank {

    private List<Account> accounts;
    // Конструктор та інші методи класу...
    public void processAccounts() {
        accounts.forEach(this::calculateInterest);
    }

    public void calculateInterest(Account account) {
        double interest = account.getBalance() * account.getInterestRate() / 100;
        System.out.println("Interest calculated: " + interest);
        // Логіка для обчислення відсотків...
    }
}

