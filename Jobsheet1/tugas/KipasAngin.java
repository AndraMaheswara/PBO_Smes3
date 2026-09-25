package Jobsheet1.tugas;

public class KipasAngin {
    private String merk;
    private int kecepatan;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void tambahKecepatan(int increment) {
        this.kecepatan += increment;
    }

    public void cetakInformasi() {
        System.out.println("=== KIPAS ANGIN ===");
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan: " + kecepatan + " level");
        System.out.println();
    }
}
