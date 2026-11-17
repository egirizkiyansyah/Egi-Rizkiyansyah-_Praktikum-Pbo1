
package unguided.komposisi;

public class Mesin {
    private String jenis;
    private int kapasitas;

    public Mesin(String jenis, int kapasitas) {
        this.jenis = jenis;
        this.kapasitas = kapasitas;
    }

    public void tampilkanMesin() {
        System.out.println(jenis + " - " + kapasitas + " CC");
    }
}
