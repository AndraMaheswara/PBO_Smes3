public class PetugasSirkulasi {
    private String nama;

    public PetugasSirkulasi(String nama) {
        this.nama = nama;
    }

    public void cetakDenda(Koleksi k) {
        if (k == null) {
            System.out.println("Koleksi tidak boleh null.");
            return;
        }

        Anggota peminjam = k.getPeminjam();
        String namaPeminjam = (peminjam == null) ? "Belum ada" : peminjam.getNama();

        System.out.println("[" + k.getJenis() + "] "
                + k.getKode() + " " + k.getJudul()
                + " | Peminjam: " + namaPeminjam
                + " | Terlambat: " + k.getHariTerlambat()
                + " hari | Denda: " + k.hitungDenda());
    }
}
