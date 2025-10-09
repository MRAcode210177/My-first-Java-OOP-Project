package Computer_Assembly;

public class Memory {
    String type;
    int sizeGB;

    public Memory(String type , int sizeGB){
        this.type = type;
        this.sizeGB = sizeGB;
    }

    public int getSizeGB() {
        return sizeGB;
    }

    @Override
    public String toString() {
        return sizeGB + "GB" + type;
    }
}
