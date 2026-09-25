package Jobsheet3;
public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        
        motor.printStatus();
        motor.tambahKecepatan(); 
        motor.nyalakanMesin();
        motor.printStatus();

        System.out.println("--- Menambah Kecepatan Berulang ---");
        for (int i = 1; i <= 22; i++) {
            motor.tambahKecepatan();
        }
        
        motor.printStatus(); 

        motor.matikanMesin();
        motor.printStatus();
    }
}