import java.util.Arrays;

public class Rak {
    private String kode;
    private Koleksi[] isi;
    private int jumlah;

    public Rak(String kode) {
        this.kode = kode;
        this.isi = new Koleksi[3];
        this.jumlah = 0;
    }

    public boolean taruh(Koleksi koleksi) {
        if (koleksi == null) {
            System.out.println("Koleksi tidak boleh null.");
            return false;
        }

        if (isPenuh()) {
            System.out.println("Rak " + kode + " sudah penuh! Maksimal 3 koleksi.");
            return false;
        }

        isi[jumlah] = koleksi;
        jumlah++;
        return true;
    }

    public boolean isPenuh() {
        return jumlah >= isi.length;
    }

    public Koleksi[] getIsi() {
        return Arrays.copyOf(isi, isi.length);
    }

    public String getKode() {
        return kode;
    }

    public int getJumlah() {
        return jumlah;
    }
}
