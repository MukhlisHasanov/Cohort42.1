package lesson15;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #15
 * @author Mukhlis_Hasanov
 * @version 16-Feb-2024
 */
public class Lesson15 {
    public static void main(String[] args) {
        Cat cat = new Cat(); //("Borya", "black", 2);
//        cat.name = "Boris";
//        cat.color = "black";
//        cat.age = 2;
        cat.voice();
        System.out.println(cat.name + ", " + cat.color + ", " + cat.age);
        Cat cat1 = new Cat("Fedor", "grey", 3, 10);
//        cat1.name = "Fedor";
//        cat1.color = "grey";
//        cat1.age = 3;
        cat1.voice();
        System.out.println(cat1.name + ", " + cat1.color + ", " + cat1.age);
        System.out.println(cat1.satiated());
    }
}
