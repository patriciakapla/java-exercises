package ads10;

public abstract class Computer {
    public int gbMemory;
    public int numProcessor;

    public Computer(int gbMemory, int numProcessor){
        this.gbMemory = gbMemory;
        this.numProcessor = numProcessor;

    }

    public abstract double calculateValue();
    
}