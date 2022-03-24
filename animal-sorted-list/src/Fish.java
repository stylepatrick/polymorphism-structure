public class Fish extends Animal {

    boolean gps;

    Fish(int id, String name, boolean gps) {
        super(id, name);
        this.gps = gps;
    }

    public String speak() {
        return "blub";
    }

}
