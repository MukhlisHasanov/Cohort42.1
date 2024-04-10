package lesson36;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PersonSystem {
    static Scanner scanner = new Scanner(System.in);
    static Map<Integer, Person> idMap = new HashMap<>();

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        char operation = 0;
        do {
            System.out.println("Simple personal system: ");
            System.out.println("Enter operation ([a]dd, [d]elete, [u]pdate, [p]rint, [f]ind, e[x]it: ");
            operation = scanner.next().charAt(0);
            switch (operation) {
                case 'a':
                    add(persons);
                    break;
                case 'd':
                    delete(persons);
                    break;
                case 'u':
                    update(persons);
                    break;
                case 'p':
                    print(persons);
                    break;
                case 'f':
                    find();
                    break;
                case 'x':
                    break;
                default:
                    System.out.println("Undefined operation: " + operation);
            }
        } while (operation != 'x');
    }

    static void add(List<Person> persons) {
        System.out.print("Add: name & age: ");
        String name = scanner.next();
        int age = scanner.nextInt();
        Person person = new Person(name, age);
        idMap.put(person.getId(), person);
        persons.add(new Person(name, age));
    }

    static void delete(List<Person> persons) {
        System.out.println("Delete: id: ");
        int id = scanner.nextInt();
        //Person findPerson = findById(persons, id);
        Person findPerson = idMap.get(id);
       if (findPerson != null) {
           persons.remove(findPerson);
           idMap.remove(id);
       }
    }

    static void update(List<Person> persons) {
        System.out.println("Update: id & name & age:");
        int id = scanner.nextInt();
        String name = scanner.next();
        int age = scanner.nextInt();
        //Person findPerson = findById(persons, id);
        Person findPerson = idMap.get(id);
        if (findPerson != null) {
            findPerson.setName(name);
            findPerson.setAge(age);
        }
    }

    static void find() {
        System.out.println("Find: id: ");
        int id = scanner.nextInt();
        Person findPerson = idMap.get(id);
        if (findPerson != null);
        System.out.println(findPerson);
    }

    static Person findById(List<Person> persons, int id) {
        for (Person person : persons) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    static void print(List<Person> persons) {
        persons.forEach(System.out::println);
    }
}
