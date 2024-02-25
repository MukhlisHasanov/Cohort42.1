package lesson17.homework;

/** AIT-TR, cohort 42.1, Java Basic, Homework #17
 * @author Mukhlis_Hasanov
 * @version 26-Feb-2024
 */
public class Homework17 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("bob1", "p1", "e1", 1, 1000, 29),
                new Employee("bob2", "p2", "e2", 2, 800, 40),
                new Employee("bob3", "p3", "e3", 3, 4000, 43)
        };
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}
