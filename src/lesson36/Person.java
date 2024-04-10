package lesson36;

public class Person {
    private int id;
    private int age;
    private String name;
    private static int idCounter = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name=" + name +
                ", age='" + age + '\'' +
                '}';
    }
}
