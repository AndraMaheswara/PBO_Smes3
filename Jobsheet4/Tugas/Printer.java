package Jobsheet4.Tugas;

public class Printer {
    private String merk;

    public Printer(String merk) {
        this.merk = merk;
    }

    public void cetak(String teks) {
        System.out.println("[" + merk + "] Mencetak:");
        System.out.println(teks);
        System.out.println("[" + merk + "] Selesai mencetak.");
    }
}
