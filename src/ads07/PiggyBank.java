package ads07;

import java.util.ArrayList;

public class PiggyBank {
    ArrayList<Coin> coins = new ArrayList<Coin>();

    public void addCoin(Coin coin) {
        coins.add(coin);
    }

    public double calculateTotal() {
        double total = 0;
        for (Coin coin : coins) {
            total += coin.getValue();
        }
        return total;
    }
}
