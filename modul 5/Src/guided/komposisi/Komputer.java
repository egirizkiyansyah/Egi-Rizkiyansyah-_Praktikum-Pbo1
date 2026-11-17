package guided.komposisi;

public class Komputer {
    private CPU cpu;
    private Monitor monitor;
    private Mouse mouse;

    public Komputer() {
        cpu = new CPU("Intel Core i7", 3);
        monitor = new Monitor("Samsung");
        mouse = new Mouse("Logitech", "Wireless");
    }

    public void DisplaySpecKomputer() {
        System.out.println("Spesifikasi Komputer");
        System.out.println("-------------------");

        System.out.print("CPU     : ");
        cpu.DisplaySpecCPU();

        System.out.print("Monitor : ");
        monitor.DisplaySpecMonitor();

        System.out.print("Mouse   : ");
        mouse.DisplaySpecMouse();
    }

    public static void main(String[] args) {
        Komputer komputer = new Komputer();
        komputer.DisplaySpecKomputer();
    }
}