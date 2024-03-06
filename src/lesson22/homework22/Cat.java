package lesson22.homework22;

public class Cat extends Animal {
    private String name;

    public Cat(String animalType, String name) {
        super(animalType);
        this.name = name;
    }



    public String voice() {
        System.out.println("Mur...mur...");
        return null;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
