
package unguided.komposisi;

public class Mobil {
    private String merek;
    private Mesin mesin;
    private Roda roda;

    public Mobil(String merek) {
        this.merek = merek;

        // Komponen dibuat di dalam objek Mobil
        mesin = new Mesin("Bensin", 1500);
        roda = new Roda("Bridgestone", 4);
    }

    public void tampilkanMobil() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merek Mobil : " + merek);

        System.out.print("Mesin       : ");
        mesin.tampilkanMesin();

        System.out.print("Roda        : ");
        roda.tampilkanRoda();
    }

    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota");

        mobil.tampilkanMobil();
    }
}
