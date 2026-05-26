package ads07;

public class Coin {
    private double value;
    private String name;

    Coin(double value, String name) {
        this.value = value;
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

}
