package lesson17.homework;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private int mob;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, int mob, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.mob = mob;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", mob=" + mob +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
