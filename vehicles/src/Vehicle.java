public class Vehicle {

    int gasCapacity;
    int drivenMiles;
    boolean gasEmpty;
    String type;

    Vehicle(){}

    Vehicle(int gasCapacity, String type) {
        this.type = type;
        this.gasCapacity = gasCapacity;
        this.gasEmpty = false;
        this.drivenMiles = 0;
    }

    void drive(int miles) {
        // needs 1l per mile
        int rest = this.gasCapacity - miles;
        if (!gasEmpty && rest >= 0) {
            this.gasCapacity = rest;
            this.drivenMiles = this.drivenMiles + miles;
            System.out.println(this.type + " DrivenMiles: " + this.drivenMiles + " GasCapacity: " + this.gasCapacity);
            if (rest == 0) {
                this.gasEmpty = true;
                System.out.println(this.type + " GasEmpty! Please refuel!");
            }
        } else {
            System.out.println(this.type + " Not available for " + miles + " miles! Left: " + this.gasCapacity);
        }
    }

    void refuel(int capacity) {
        this.gasCapacity = this.gasCapacity + capacity;
        if (this.gasEmpty && this.gasCapacity > 0) {
            this.gasEmpty = false;
        }
        System.out.println(this.type + " Refueld: " + this.gasCapacity);
    }
}
