package lesson15;

public class Cat {
    String name, color;
    int age, energy, food, run, walkEnergy;

    public Cat(String name, String color, int age, int energy) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.energy = energy;
    }

    public Cat() {
    }

    public void walk(int walkEnergy) {
        this.walkEnergy = walkEnergy;
    }

    public int walkCommand() {
        return energy - walkEnergy;
    }

    public void eat(int food) {
        this.food = food;
    }

    public int satiated() {
        return food * 100 / energy;
    }

    public void voice() {
        System.out.println("Meow");
    }
}
