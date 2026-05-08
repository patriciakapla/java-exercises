package ads04;

public class App {

    public static void main(String[] args) {

        Account account1 = new Account(827349, "Buffy Summers", 5000, 0);

        account1.displayInfo();

        if (!account1.withdraw(5200)) {
            System.out.println("Couldn't withdraw! Check if your balance allows you to withdraw this amount.");
        }
        account1.displayInfo();
        account1.deposit(600);
        account1.displayInfo();
        account1.withdraw(5200);
        account1.displayInfo();
    }
}