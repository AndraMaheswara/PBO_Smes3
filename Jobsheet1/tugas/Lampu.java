package Jobsheet1.tugas;

public class Lampu {
    private String warna;
    private int dayaWatt;

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setDaya(int watt) {
        this.dayaWatt = watt;
    }

    public void cetakInformasi() {
        System.out.println("=== LAMPU ===");
        System.out.println("Warna Cahaya: " + warna);
        System.out.println("Daya Watt: " + dayaWatt + " W");
        System.out.println();
    }
}