package lesson15;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #15 Cat
 * @author Mukhlis_Hasanov
 * @version 16-Feb-2024
 */
public class Cat {
    String name;
    String color;
    int age;
    int volume;
    int food;


    public Cat(String name, String color, int age , int volume) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.volume = volume;

    }

    public Cat() {
    }

    public void eat(int food) {
        this.food = food;
    }

    public double satiated() {
        return (double) food / volume * 100;
    }

    public void voice() {
        System.out.println("Meow!");
    }
}
