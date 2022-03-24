public class Truck extends Vehicle {

    String company;

    Truck(String company, int gasCapacity) {
        super(gasCapacity, "Truck");
        this.company = company;
    }

}
