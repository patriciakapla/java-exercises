package ads04;

public class Account {

    int number;
    String holder;
    double balance, limit;

    Account() {

    }

    Account(int number, String holder, double balance, double limit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.limit = limit;
    }

    boolean withdraw(double amount) {
        if (balance < amount || amount <= 0) {
            return false;
        }
        balance -= amount;
        return true;
    }

    boolean deposit(double amount) {
        if (amount <= 0)
            return false;
        balance += amount;
        return true;
    }

    void displayInfo() {
        System.out.println();
        System.out.println("Account's information:");
        System.out.printf("Number: %d\n", number);
        System.out.println("Holder: " + holder);
        System.out.printf("Balance: %.2f\n", balance);
        System.out.printf("Limit: %.2f\n", limit);
    }
}
