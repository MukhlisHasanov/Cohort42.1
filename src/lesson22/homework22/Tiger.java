package lesson22.homework22;

public class Tiger extends Animal {
    private String name;

    public Tiger(String animalType, String name) {
        super(animalType);
        this.name = name;
    }

    public void hunt() {
        System.out.println("Hunting...");
    }
}
