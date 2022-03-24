public class Car extends Vehicle implements Revision {

    String brand;
    String color;

    Car(String brand, String color, int gasCapacity) {
        super(gasCapacity, "Car");
        this.brand = brand;
        this.color = color;
    }

    public void doRevision() {
        System.out.println(type +  " Revision finished!");
    }
}
