package Computer_Assembly;

public class Processor {
    String model;
    int core;

    public Processor(String model,int core){
        this.model = model;
        this.core = core;
    }

    @Override
    public String toString() {
        return model + "( "+ core+" cores)";
    }
}
