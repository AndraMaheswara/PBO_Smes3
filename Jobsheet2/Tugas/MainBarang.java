package Jobsheet2.Tugas;

public class MainBarang {
    public static void main(String[] args) {
        Barang b = new Barang();
        b.kode = "BRG01";
        b.namaBarang = "Keyboard Gaming";
        b.hargaDasar = 200000;
        b.diskon = 10;

        b.tampilData();
    }
}