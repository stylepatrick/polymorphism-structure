public class SortedList {

    Animal head;

    void push(Animal animal) {
        Animal h = head;
        Animal prev = null;
        while (h != null && !h.idSmallerThan(animal)) {
            prev = h;
            h = h.next;
        }
        if (h == head) {
            animal.next = head;
            head = animal;
        } else {
            prev.next = animal;
            animal.next = h;
        }
    }

    void print() {
        Animal h = head;
        if (h != null) {
            while (h != null) {
                // Check type of animal, if true cast it and call methods/fields from it
                if (h instanceof Fish) {
                    Fish f = (Fish) h;
                    System.out.println(f.id + " - " + f.name + " - " + f.gps);
                } else if (h instanceof Dog) {
                    Dog g = (Dog) h;
                    System.out.println(g.id + " - " + g.name + " - " + g.size);
                } else {
                    System.out.println(h.id + " - " + h.name);
                }

                // Interface can be used too for type checking and casting
                if (h instanceof JumpFeature) {
                    JumpFeature jF = (JumpFeature) h;
                    System.out.println(jF.jump());
                }
                h = h.next;
            }
        }
    }

}
