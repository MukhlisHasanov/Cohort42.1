package lesson15;

import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, Homework #15
 * @author Mukhlis_Hasanov
 * @version 17-Feb-2024
 */
public class Homework15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cat cat1 = new Cat("Fedor", "grey", 3, 100);
        System.out.println(cat1.name + ", " + cat1.color + ", " + cat1.age);
        System.out.print("Give some meal's to " + cat1.name + " [1..100]: ");
        cat1.eat(scanner.nextInt());
        cat1.voice();
        System.out.println("Cat's energy = " + cat1.satiated());
        System.out.println();
        System.out.print("Enter activity for your cat [walk, run]: ");
        cat1.walk(scanner.nextInt());
        System.out.println("Cat's energy = " + cat1.walkCommand());
    }
}
