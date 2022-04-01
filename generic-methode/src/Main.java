public class Main {

    public static void main(String[] args) {

        Person[] people = new Person[3];
        people[0] = new Person("Patrick", 26);
        people[1] = new Person("Raimund", 50);
        people[2] = new Person("Michale", 12);

        Printer[] printers = new Printer[2];
        printers[0] = new Printer("HP", 4);
        printers[1] = new Printer("Dell", 1);

        Person person = (Person) max(people);

        Printer printer = (Printer) max(printers);

    }

    private static <T> Comparable<T> max(Comparable<T>[] arr) {
        Comparable<T> a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo((T) a) > 0) {
                a = arr[i];
            }
        }
        return a;
    }
}
