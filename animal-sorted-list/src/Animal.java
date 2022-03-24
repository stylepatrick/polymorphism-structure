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
        return animal.id < this.id;
    }

    // Abstract methode (if one methode is abstract class must be abstract too), no implementation of methode
    public abstract String speak();

}
