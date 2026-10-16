package Jobsheet4.Tugas;

public class DetailPesanan {
    private String produk;
    private int jumlah;
    private int harga;

    public DetailPesanan(String produk, int jumlah, int harga) {
        this.produk = produk;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public int hitungSubtotal() {
        return jumlah * harga;
    }

    public String info() {
        return produk + " x" + jumlah
                + " = Rp" + hitungSubtotal();
    }
}
