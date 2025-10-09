package Computer_Assembly;

public class Computer {
    private String brand;
    Processor cpu;
    Memory ram;

    public Computer(String brand, Processor cpu, Memory ram){
        this.brand = brand;
        this.cpu = cpu;
        this.ram = ram;
        System.out.println("New " + brand + " Computer assembled: " + cpu + ", " + ram);
    }

    public void runTest(int requiredMemoryGB){
        System.out.printf("\n--- Running System Test (Req: %dGB) ---\n", requiredMemoryGB);

        if(ram.getSizeGB() < requiredMemoryGB){
            throw new InsufficientMemoryException(
                    "Test failed! System has only " + ram.getSizeGB() + "GB RAM. Requires " + requiredMemoryGB + "GB."
            );
        }else {
            System.out.println(" System check passed! Memory sufficient.");
        }

    }
}
