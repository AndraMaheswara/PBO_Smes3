package Jobsheet4.Tugas;

public class Pesanan {
    private String nomor;


    private Pelanggan pelanggan;


    private DetailPesanan[] detailPesanan;

    public Pesanan(String nomor, Pelanggan pelanggan, int jumlahDetail) {
        this.nomor = nomor;
        this.pelanggan = pelanggan;
        this.detailPesanan = new DetailPesanan[jumlahDetail];
    }

    public void tambahDetail(int index, String produk, int jumlah, int harga) {
        if (index < 0 || index >= detailPesanan.length) {
            System.out.println("Index detail tidak valid.");
            return;
        }

        if (detailPesanan[index] != null) {
            System.out.println("Detail pada index tersebut sudah terisi.");
            return;
        }

        detailPesanan[index] =
                new DetailPesanan(produk, jumlah, harga);
    }

    public int hitungTotal() {
        int total = 0;

        for (DetailPesanan detail : detailPesanan) {
            if (detail != null) {
                total += detail.hitungSubtotal();
            }
        }

        return total;
    }


    public void cetakPesanan(Printer printer) {
        printer.cetak(
                "Pesanan " + nomor
                + " milik " + pelanggan.getNama()
        );
    }

    public void info() {
        System.out.println("Nomor Pesanan: " + nomor);
        System.out.println("Pelanggan: " + pelanggan.getNama());

        System.out.println("Detail Pesanan:");

        for (DetailPesanan detail : detailPesanan) {
            if (detail != null) {
                System.out.println("- " + detail.info());
            }
        }

        System.out.println("Total: Rp" + hitungTotal());
    }
}
