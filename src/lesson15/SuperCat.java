package lesson15;

/**
 * AIT-TR, cohort 42.1, Java Basic, Homework #15 (Cat)
 * @author Mukhlis_Hasanov
 * @version 18-Feb-2024
 */
public class SuperCat {
    public int energyLevel, age;
    public String name, color;

    public SuperCat(String catName, String catColor, int catAge, int initialEnergy) {
        this.energyLevel = initialEnergy;
        this.name = catName;
        this.color = catColor;
        this.age = catAge;
    }

    public void walk() {
        System.out.println("Cat is walking...");
        energyLevel -= 5; // Decreasing energy levels while walk
    }

    public void eat() {
        System.out.println("Cat is eating...");
        energyLevel += 10; // Increasing energy levels with feeding
    }

    public void sleep() {
        System.out.println("Cat is sleeping...");
        energyLevel += 20; // Increasing energy levels while sleeping
    }

    public void play() {
        System.out.println("Cat is playing...");
        energyLevel -= 15; // Decreasing energy levels while play
    }

    public void run() {
        System.out.println("Cat is running...");
        energyLevel -= 30; // Decreasing energy levels while run
    }

    public void voice() {
        System.out.println("Meow");
    }


    public int getEnergyLevel() {
        return energyLevel;
    }
}
