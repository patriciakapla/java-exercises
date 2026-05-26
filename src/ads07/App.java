package ads07;

public class App {

    public static void main(String[] args) {
        PiggyBank piggy = new PiggyBank();

        piggy.addCoin(new Coin(5, "dól"));
        piggy.addCoin(new Coin(15, "reau"));
        piggy.addCoin(new Coin(20, "dól"));

        System.out.printf("Total: $ %.2f", piggy.calculateTotal());
    }
}
