public class Main {

    public static void main(String[] args) {
        // Child objects are part of parent object.
        // Only methods and fields can be used which are in Animals class
        // Dynamic binding: if the same methode is present in the child and parent class
        // Java uses the methode from the child class
        Animal dog = new Dog(1, "Michael", 5);
        Animal fish = new Fish(0, "Patrick", true);

        Cat cat = new Cat(3, "Snow");
        Animal catA = new Cat(2, "Black");

        JumpFeature jumper = (JumpFeature) dog;
        System.out.println(jumper.jump());

        System.out.println(dog.speak());
        System.out.println(fish.speak());
        System.out.println(cat.speak());

        Cat cat1 = (Cat) catA;

        System.out.println(cat1.jump());

        SortedList sortedList = new SortedList();
        sortedList.push(dog);
        // Animal catA = cat;
        sortedList.push(cat);
        sortedList.push(fish);
        sortedList.push(catA);

        sortedList.print();
    }

}
