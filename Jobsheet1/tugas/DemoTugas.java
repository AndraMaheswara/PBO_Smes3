package Jobsheet1.tugas;

public class DemoTugas {
    public static void main(String[] args) {
        KipasAngin kipas = new KipasAngin();
        kipas.setMerk("Miyako");
        kipas.tambahKecepatan(3);
        kipas.cetakInformasi();

        Lampu lampu = new Lampu();
        lampu.setWarna("Warm White");
        lampu.setDaya(12);
        lampu.cetakInformasi();

        Laptop laptop = new Laptop();
        laptop.setMerk("ASUS");
        laptop.setDaya(65);
        laptop.setUkuranLayar(14.0);
        laptop.setKapasitasRam(16);
        laptop.cetakInformasi();

        Televisi tv = new Televisi();
        tv.setMerk("Samsung");
        tv.setDaya(100);
        tv.setUkuranInci(43);
        tv.pindahSaluran(7);
        tv.cetakInformasi();
    }
}   