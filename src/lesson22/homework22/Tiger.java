package lesson22.homework22;

public class Tiger extends Cat {

    protected int age;

    public Tiger(String animalType, String name, int age) {
        super(animalType, name);
        this.age = age;
    }

    @Override
    public String voice() {
        return "Roar!";
    }

    public void hunt() {
        System.out.println("Hunting...");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "age='" + age + '\'' +
                '}';
    }
}
