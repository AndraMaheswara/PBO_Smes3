package Jobsheet2.Tugas;

public class MainPeminjaman {
    public static void main(String[] args) {
        Peminjaman p = new Peminjaman();
        p.id = 101;
        p.namaMember = "Andi";
        p.namaGame = "Elden Ring";
        p.harga = 25000;
        p.lamaSewa = 3;

        p.tampilData();
    }
}