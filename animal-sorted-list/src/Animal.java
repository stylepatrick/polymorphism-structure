// Abstract class can have methods implementations, constructors and fields.
public abstract class Animal {

    int id;
    String name;
    Animal next;

    Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean idSmallerThan(Animal animal) {
        return this.id < animal.id;
    }

    // If one methode in class is abstract class must be abstract too
    public abstract String speak();

}
