
package unguided.agregasi;

public class Jurusan {
    private String kodeJurusan;
    private String namaJurusan;
    private Mahasiswa[] daftarMahasiswa;
    private int jumlahMahasiswa;

    public Jurusan(String kode, String nama) {
        this.kodeJurusan = kode;
        this.namaJurusan = nama;
        this.daftarMahasiswa = new Mahasiswa[10];
        this.jumlahMahasiswa = 0;
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        if (jumlahMahasiswa < daftarMahasiswa.length) {
            daftarMahasiswa[jumlahMahasiswa] = mahasiswa;
            jumlahMahasiswa++;
        } else {
            System.out.println("Daftar mahasiswa penuh!");
        }
    }

    public void tampilkanMahasiswa() {
        System.out.println("=== DATA JURUSAN ===");
        System.out.println("Kode Jurusan : " + kodeJurusan);
        System.out.println("Nama Jurusan : " + namaJurusan);

        System.out.println("\n=== DAFTAR MAHASISWA ===");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println(
                daftarMahasiswa[i].getNim() + " - " +
                daftarMahasiswa[i].getNama()
            );
        }
    }

    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("2311110042", "Egi Rizkiyansyah");
        Mahasiswa m2 = new Mahasiswa("2311110043", "Andi");
        Mahasiswa m3 = new Mahasiswa("2311110044", "Budi");

        Jurusan jurusan = new Jurusan("SD001", "Sains Data");

        jurusan.tambahMahasiswa(m1);
        jurusan.tambahMahasiswa(m2);
        jurusan.tambahMahasiswa(m3);

        jurusan.tampilkanMahasiswa();
    }
}
