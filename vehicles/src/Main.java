public class Main {

    public static void main(String args[]) {
        Vehicle car = new Car("BMW", "blue", 100);
        Vehicle truck = new Truck("Amazon", 400);
        Vehicle bicycle = new Bicycle("Mountainbike", "Bicylce");
        Revision bicycleFromRev = new Bicycle("Mountainbike-1", "BicylceFromRev");

        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = car;
        vehicles[1] = truck;
        vehicles[2] = bicycle;
        vehicles[3] = (Vehicle) bicycleFromRev;

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Revision) {
                Revision revision = (Revision) vehicle;
                revision.doRevision();
            }
            vehicle.drive(99);
            vehicle.drive(1);
            vehicle.drive(11);
            vehicle.refuel(10);
            vehicle.drive(4);
        }
    }
}
