package Jobsheet4.Tugas;

public class MainTugasMandiri {
    public static void main(String[] args) {


        Pelanggan pelanggan =
                new Pelanggan(
                        "Andra",
                        "andra@example.com"
                );

        Pesanan pesanan =
                new Pesanan(
                        "ORD-001",
                        pelanggan,
                        3
                );


        pesanan.tambahDetail(
                0,
                "Keyboard",
                1,
                500000
        );

        pesanan.tambahDetail(
                1,
                "Mouse",
                2,
                250000
        );

        pesanan.tambahDetail(
                2,
                "Mousepad",
                1,
                150000
        );

        pesanan.info();

        System.out.println();


        Printer printer =
                new Printer("Epson L3110");

        pesanan.cetakPesanan(printer);
    }
}
