
package unguided.komposisi;

public class Roda {
    private String merek;
    private int jumlah;

    public Roda(String merek, int jumlah) {
        this.merek = merek;
        this.jumlah = jumlah;
    }

    public void tampilkanRoda() {
        System.out.println(merek + " - " + jumlah + " buah");
    }
}
