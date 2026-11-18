package superkeyword;

public class Manager extends Employee {
    private String alamat;

    public Manager(String nama, String s) {
        super(nama);
        alamat = s;
    }

    public void tampilAlamat() {
        super.departemen = "Personalia";

        super.tampilNama();

        System.out.println("alamat : " + alamat);
        System.out.println("departemen : " + super.departemen);
    }
}