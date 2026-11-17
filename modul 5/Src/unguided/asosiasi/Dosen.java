
package unguided.asosiasi;

public class Dosen {
    private String kodeDosen;
    private String namaDosen;

    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getKodeDosen() {
        return kodeDosen;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void beriNilai(Mahasiswa mahasiswa, int nilai) {
        mahasiswa.setNilai(nilai);
    }

    public int lihatNilai(Mahasiswa mahasiswa) {
        return mahasiswa.getNilai();
    }

    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.setNim("2311110042");
        m.setNama("Egi Rizkiyansyah");

        Dosen d = new Dosen();
        d.setKodeDosen("DS001");
        d.setNamaDosen("Budi");

        d.beriNilai(m, 90);

        System.out.println("=== DATA DOSEN ===");
        System.out.println("Kode Dosen : " + d.getKodeDosen());
        System.out.println("Nama Dosen : " + d.getNamaDosen());

        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("NIM        : " + m.getNim());
        System.out.println("Nama       : " + m.getNama());
        System.out.println("Nilai      : " + d.lihatNilai(m));
    }
}
