package construktor;

public class Manusia {
    private String nama;
    private int umur;

    // Constructor tanpa parameter
    public Manusia() {
    }

    // Constructor dengan parameter nama
    public Manusia(String a) {
        nama = a;
    }

    // Constructor dengan parameter nama dan umur
    public Manusia(String a, int b) {
        nama = a;
        umur = b;
    }

    public void setNama(String a) {
        nama = a;
    }

    public String getNama() {
        return nama;
    }

    public void setUmur(int a) {
        umur = a;
    }

    public int getUmur() {
        return umur;
    }
}