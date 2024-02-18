package lesson15;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #7
 * @author Mukhlis_Hasanov
 * @version 29-Jan-2024
 */

import java.util.Scanner;

public class Homework15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SuperCat myCat = new SuperCat("Boris", "Black", 2, 100); // Create a cat with initial energy
        System.out.println("Hi! I am your digital cat. My name is "+ myCat.name);
        System.out.println("My color is " + myCat.color);
        System.out.println("It is " + myCat.age + " years old");
        System.out.println("The " + myCat.name + " initial energy level: " + myCat.getEnergyLevel());
        System.out.println("Let's play together!");

        do {
        System.out.print("Please, enter activity for " + myCat.name + " [eat/sleep/walk/run/play]: ");
        String activity = scanner.nextLine();
            switch (activity) {
                case "eat":
                    myCat.eat(); // Cat is eating
                    myCat.voice();
                    System.out.println("Energy level after eating: " + myCat.getEnergyLevel());
                    break;
                case "sleep":
                    myCat.sleep(); // Cat is sleeping
                    System.out.println("Energy level after sleeping: " + myCat.getEnergyLevel());
                    break;
                case "run":
                    myCat.run(); // Cat is running
                    System.out.println("Energy level after running: " + myCat.getEnergyLevel());
                    break;
                case "play":
                    myCat.play(); // Cat is playing
                    System.out.println("Energy level after playing: " + myCat.getEnergyLevel());
                    break;
                case "walk":
                    myCat.walk(); // Cat is walking
                    System.out.println("Energy level after walking: " + myCat.getEnergyLevel());
                    break;
                default:
                    System.out.println("Bye bye");
            }
        } while (myCat.energyLevel > 0 && myCat.energyLevel < 110); {
            System.out.println("Cat is DEAD!");
        }
    }
}