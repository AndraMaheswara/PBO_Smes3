package Jobsheet3.Tugas;

import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg\n");

        System.out.print("Masukkan berat muatan yang ingin ditambah (kg): ");
        double tambah = sc.nextDouble();
        System.out.println("x: x: \"\nMemasukkan muatan baru seberat " + tambah + " kg...\"");
        kontainerAlfa.tambahMuatan(tambah);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg\n");

        System.out.print("Masukkan berat muatan yang ingin diturunkan (kg): ");
        double turun = sc.nextDouble();
        System.out.println("x: x: \"\nMembongkar muat/menurunkan barang seberat " + turun + " kg...\"");
        kontainerAlfa.turunkanMuatan(turun);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        sc.close();
    }
}