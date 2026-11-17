package guided.agregasi;

public class Jurusan {
    private String KodeJurusan;
    private String NamaJurusan;
    private Mahasiswa[] Daftar = new Mahasiswa[10];

    private int JmlMhs = 0;

    public Jurusan(String kode, String nama) {
        this.KodeJurusan = kode;
        this.NamaJurusan = nama;
    }

    public void AddMahasiswa(Mahasiswa m) {
        if (JmlMhs < Daftar.length) {
            Daftar[JmlMhs] = m;
            JmlMhs++;
        }
    }

    public void DisplayMahasiswa() {
        System.out.println("Kode Jurusan : " + KodeJurusan);
        System.out.println("Nama Jurusan : " + NamaJurusan);
        System.out.println("Daftar Mahasiswa :");

        for (int i = 0; i < JmlMhs; i++) {
            System.out.println(
                Daftar[i].GetNIM() + " " + Daftar[i].GetNama()
            );
        }
    }

    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("2311110042", "Egi Rizkiyansyah");
        Mahasiswa m2 = new Mahasiswa("2311110043", "Budi");

        Jurusan j = new Jurusan("SD001", "Sains Data");

        j.AddMahasiswa(m1);
        j.AddMahasiswa(m2);

        j.DisplayMahasiswa();
    }
}