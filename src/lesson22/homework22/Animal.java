package lesson22.homework22;

public class Animal {
    protected String animalType;

    public Animal(String animalType) {
        this.animalType = animalType;
    }

    public void lay() {
        System.out.println("Mrr...");
    }

    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalType='" + animalType + '\'' +
                '}';
    }
}
