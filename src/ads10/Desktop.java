package ads10;

public class Desktop extends Computer {
    public double accessories;

    public Desktop(int gbMemory, int numProcessor, double accessories){
        super(gbMemory, numProcessor);
        this.accessories = accessories;
    }

    @Override
    public double calculateValue(){
        double total = (200.0 * gbMemory) + (400.0 * numProcessor) + accessories;
        return total;
    }
}