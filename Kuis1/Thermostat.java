package Kuis1;


public class Thermostat {
    private int suhu;

    public Thermostat() {
        suhu = 4;
    }

    public int getSuhu() {
        return suhu;
    }

    public void naik() {
        if (suhu >= 7) {
            System.out.println("Suhu di luar batas aman (1-7 C)");
            return;
        }

        suhu++;
    }

    public void turun() {
        if (suhu <= 1) {
            System.out.println("Suhu di luar batas aman (1-7 C)");
            return;
        }

        suhu--;
    }
}