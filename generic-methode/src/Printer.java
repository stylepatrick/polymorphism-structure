public class Printer implements Comparable<Printer> {

    String name;
    int id;

    Printer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Printer o) {
        return Integer.compare(id, o.id);
    }

}
