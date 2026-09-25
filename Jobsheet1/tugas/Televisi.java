package Jobsheet1.tugas;

public class Televisi extends Elektronik {
    private int ukuranInci;
    private int saluranTv;

    public void setUkuranInci(int ukuranInci) {
        this.ukuranInci = ukuranInci;
    }

    public void pindahSaluran(int saluranBaru) {
        this.saluranTv = saluranBaru;
    }

    @Override
    public void cetakInformasi() {
        System.out.println("=== TELEVISI ===");
        super.cetakInformasi();
        System.out.println("Ukuran Layar: " + ukuranInci + " inci");
        System.out.println("Saluran Saat Ini: " + saluranTv);
        System.out.println();
    }
}