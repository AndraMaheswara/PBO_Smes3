package Kuis1;
public class Kulkas {
    private String merk;
    private Thermostat thermostat;

    public Kulkas(String merk) {
        this.merk = merk;
        this.thermostat = new Thermostat();
    }

    public void lebihDingin() {
        thermostat.turun();
    }

    public void kurangDingin() {
        thermostat.naik();
    }

    public void aturSuhu(int target) {
        if (target < 1 || target > 7) {
            System.out.println("Target suhu tidak valid");
            return;
        }

        while (thermostat.getSuhu() < target) {
            thermostat.naik();
        }

        while (thermostat.getSuhu() > target) {
            thermostat.turun();
        }
    }

    public void tampilkanInfo() {
        System.out.println(
            "Kulkas " + merk + " | Suhu: "
            + thermostat.getSuhu() + " C"
        );
    }
}
