package lesson15;

import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, Homework #15
 * @author Mukhlis_Hasanov
 * @version 18-Feb-2024
 */
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

        // #Task Car
        Car myCar = new Car("Nissan Skyline BNR-34 GT-R", "Grey Metallic", 1998, 70);
        System.out.println();
        myCar.carInfo();
        System.out.print("Please, start engine: "); //write start to start engine
        scanner.nextLine();
        myCar.carVoice();
        System.out.println();
        myCar.startEngine();
        System.out.println();

        do {
            System.out.print("Please choice an action [0-refuel, 1-drive, 2-soundOfPeace]: ");
            int action = scanner.nextInt();
            switch (action) {
                case 0:
                    myCar.refuel();
                    break;
                case 1:
                    myCar.drive();
                    break;
                case 2:
                    myCar.carVoice();
                    break;
            }
        } while (myCar.fuelLevel > 0);
    }
}