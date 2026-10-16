public class Perpustakaan {
    private String nama;
    private Rak[] daftarRak;
    private Pustakawan kepala;

    public Perpustakaan(String nama, int jumlahRak) {
        this.nama = nama;
        if (jumlahRak < 0) {
            jumlahRak = 0;
        }

        
        daftarRak = new Rak[jumlahRak];
        for (int i = 0; i < jumlahRak; i++) {
            daftarRak[i] = new Rak("R-" + (i + 1));
        }
    }

    public void setKepala(Pustakawan kepala) {
        if (kepala == null) {
            System.out.println("Kepala tidak boleh null.");
            return;
        }
        this.kepala = kepala;
    }

    // Menyimpan ke rak pertama yang belum penuh.
    public void simpanKoleksi(Koleksi koleksi) {
        if (koleksi == null) {
            System.out.println("Koleksi tidak boleh null.");
            return;
        }

        for (Rak rak : daftarRak) {
            if (!rak.isPenuh()) {
                rak.taruh(koleksi);
                return;
            }
        }

        System.out.println("Semua rak penuh! Koleksi " + koleksi.getJudul() + " tidak dapat disimpan.");
    }

    public void simpanKoleksi(Koleksi koleksi, int nomorRak) {
        if (koleksi == null) {
            System.out.println("Koleksi tidak boleh null.");
            return;
        }

        if (nomorRak < 1 || nomorRak > daftarRak.length) {
            System.out.println("Nomor rak tidak valid.");
            return;
        }

        daftarRak[nomorRak - 1].taruh(koleksi);
    }

    public void tampilInfo() {
        System.out.println("\n=== INFO PERPUSTAKAAN ===");
        System.out.println("Nama: " + nama);

        if (kepala != null) {
            System.out.println("Kepala: " + kepala.getNama());
        } else {
            System.out.println("Kepala: Belum ditentukan");
        }

        for (Rak rak : daftarRak) {
            System.out.println("\n" + rak.getKode() + " (" + rak.getJumlah() + "/3 koleksi)");
            for (Koleksi k : rak.getIsi()) {
                if (k != null) {
                    System.out.println("- " + k.getKode() + " " + k.getJudul());
                }
            }
        }
    }
}
