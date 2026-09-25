package Jobsheet1.tugas;

public class Laptop extends Elektronik {
    private double ukuranLayar;
    private int kapasitasRam;

    public void setUkuranLayar(double ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }

    public void setKapasitasRam(int kapasitasRam) {
        this.kapasitasRam = kapasitasRam;
    }

    @Override
    public void cetakInformasi() {
        System.out.println("=== LAPTOP ===");
        super.cetakInformasi();
        System.out.println("Ukuran Layar: " + ukuranLayar + " inci");
        System.out.println("Kapasitas RAM: " + kapasitasRam + " GB");
        System.out.println();
    }
}