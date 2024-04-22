package lesson22;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #22
 * @author Mukhlis hasanov
 * @version 4-Mar-24
 */
public class Lesson22 {
    public static void main(String[] args) {
        Horse horse = new Horse("Thunder");
        System.out.println(horse);
        horse.run();

        Pegas pegas = new Pegas("Pegas");
        System.out.println(pegas);
        pegas.walk();
        pegas.run();
        pegas.fly();
    }
}
