package Jobsheet1;

public class BikeDemo {
    public static void main(String[] args) {
        Bike mountainBike1 = new Bike();
        Bike mountainBike2 = new Bike();
        RoadBike roadBike1 = new RoadBike();

        mountainBike1.setBrand("Trek");
        mountainBike1.gearChanges(2);
        mountainBike1.speedAcceleration(10);
        mountainBike1.printInfo();

        mountainBike2.setBrand("Giant");
        mountainBike2.gearChanges(3);
        mountainBike2.speedAcceleration(20);
    
        mountainBike2.printInfo();

        roadBike1.setBrand("Specialized");
        roadBike1.setTireWidth(25);
        roadBike1.gearChanges(7); 
        roadBike1.speedAcceleration(15);
        roadBike1.printInfo();
    }
}


class RoadBike extends Bike {
    private int tireWidth;

    public void setTireWidth(int width) {
        tireWidth = width;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Tire Width : " + tireWidth + " mm");
        System.out.println("Bike Type : Road Bike");
    }
}   