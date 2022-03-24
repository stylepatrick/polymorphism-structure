public class Bicycle extends Vehicle implements Revision {

    String brand;

    Bicycle(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    void drive(int miles) {
        this.drivenMiles = this.drivenMiles + miles;
        System.out.println(type + " drivenMiles: " + drivenMiles);
    }

    void refuel(int capacity) {
    }

    public void doRevision() {
        System.out.println(type + " Revision finished!");
    }
}
