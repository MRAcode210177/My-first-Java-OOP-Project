package Computer_Assembly;

public class AssemblyApp {
    public static void main(String[] args){
        Processor i7 = new Processor("Intel i7-12700K", 12);
        Memory ddr5_16 = new Memory("DDR5", 16);

        Computer pc = new Computer("Custom Build", i7, ddr5_16);

        // 5. Testing 1: Success
        try {
            pc.runTest(8);
        } catch (InsufficientMemoryException e) {
            System.err.println(" ERROR CAUGHT: " + e.getMessage());
        }

        // 5. Testing 2: Failure
        try {
            pc.runTest(32);
        } catch (InsufficientMemoryException e) {
            // The custom exception is caught here
            System.err.println(" ERROR CAUGHT: " + e.getMessage());
        }
    }
}
