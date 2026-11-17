package guided.komposisi;

public class Monitor {
    private String Merk;

    public Monitor(String m) {
        this.Merk = m;
    }

    public void DisplaySpecMonitor() {
        System.out.println(Merk);
    }
}