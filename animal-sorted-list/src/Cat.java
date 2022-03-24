public class Cat extends Animal implements JumpFeature {

    Cat(int id, String name) {
        // Calls constructor of parent class. If not present it will call the default constructor of the parent class
        super(id, name);
    }

    // Overwrite methode from parent
    public String speak() {
        return "miau";
    }

    // Implementation of methode from JumpFeature interface
    public String jump() {
        return "jump!";
    }
}
