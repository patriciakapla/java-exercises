package ads10;

public class Notebook extends Computer{
    public int screenInches;

    public Notebook(int gbMemory, int numProcessor, int screenInches){
        super(gbMemory, numProcessor);
        this.screenInches = screenInches;
    }

    @Override
    public double calculateValue(){
        double total = (gbMemory*250) + (numProcessor * 500) + (screenInches * 100);
        return total;
    }
}