package lesson34;

import lesson17.homework.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * AIT-TR, cohort 42.1, Java Basic, Homework #34
 * @author Mukhlis Hasanov
 * @version 08-Apr-24
 */
public class Homework34 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("name2", "position1", "email1", "phone1", 12500, 35),
                new Employee("name3", "position1", "email1", "phone1", 12500, 36),
                new Employee("name1", "position1", "email1", "phone1", 12500, 25)
        ));

        Comparator<Employee> nameComparator = (e1, e2) -> e1.getName().compareTo(e2.getName());
        Collections.sort(employees, nameComparator);
        System.out.println(employees);

        Comparator<Employee> ageComparator = (e1, e2) -> Integer.compare(e1.getAge(), e2.getAge());
        Collections.sort(employees, ageComparator);
        System.out.println(employees);
    }
}
