package Jobsheet1.tugas;

public class Elektronik {
    private String merk;
    private int daya;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setDaya(int daya) {
        this.daya = daya;
    }

    public void cetakInformasi() {
        System.out.println("Merk: " + merk);
        System.out.println("Daya Listrik: " + daya + " Watt");
    }
}
