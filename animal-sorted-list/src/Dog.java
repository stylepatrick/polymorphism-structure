public class Dog extends Animal implements JumpFeature {

    int size;

    Dog(int id, String name, int size) {
        // Calls constructor from Animals and adds additional field
        super(id, name);
        this.size = size;
    }

    public String speak() {
        return "wuff";
    }

    public String jump() {
        return "jump!";
    }

}
