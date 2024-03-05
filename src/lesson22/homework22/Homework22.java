package lesson22.homework22;

/**
 * AIT-TR, cohort 42.1, Java Basic, Homework #22
 * @author Mukhlis hasanov
 * @version 5-Mar-24
 */
public class Homework22 {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        System.out.println(animal);
        animal.lay();
        animal.eat();

        Tiger tiger = new Tiger("Tiger", "Mishka");
        System.out.println();
        System.out.println(tiger);
        tiger.lay();
        tiger.hunt();
        tiger.eat();

        Cat cat = new Cat("Cat", "Doggy");
        System.out.println();
        System.out.println(cat);
        cat.lay();
        cat.voice();
        cat.eat();
    }
}
