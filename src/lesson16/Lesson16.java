package lesson16;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #16
 * @author Mukhlis_Hasanov
 * @version 19-Feb-2024
 */
public class Lesson16 {
    public static void main(String[] args) {
        Cat cat = new Cat("Borya", 30, 5);
        Cat [] cats = {
                new Cat("M", 50, 20),
        };
        Plate plate = new Plate(50);
        System.out.println("Cat:" + cat.realVolume);
        System.out.println("Plate:" + plate.food);

        plate.add(20);
        cat.eat(plate);
        //plate.feeding(plate.amountFood());

        System.out.println("Cat:" + cat.realVolume);
        System.out.println("Plate:" + plate.food);
    }
}
