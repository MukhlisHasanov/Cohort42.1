package lesson26;

public class Cat extends Animal {
    private String name;

    @Override
    public String voice() {
        return "Cat: meow";
    }
}
