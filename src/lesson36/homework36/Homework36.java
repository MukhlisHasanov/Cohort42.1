package lesson36.homework36;

/**
 * AIT-TR, cohort 42.1, Java Basic, Homework #35
 * @author Mukhlis Hasanov
 * @version 12-Apr-24
 */
public class Homework36 {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.add("Иванов", "123-456-789");
        phoneDirectory.add("Петров", "987-654-321");
        phoneDirectory.add("Иванов", "111-222-333");
        phoneDirectory.add("Сидоров", "555-555-555");

        System.out.println("Телефоны Иванова: " + phoneDirectory.get("Иванов"));
        System.out.println("Телефоны Петрова: " + phoneDirectory.get("Петров"));
        System.out.println("Телефоны Сидорова: " + phoneDirectory.get("Сидоров"));
    }
}
