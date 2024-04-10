package lesson35;

/**
 * AIT-TR, Cohort42.1, Java Basic Lesson #35
 * @author Muklis Hasanov
 * @version 8-Apr-24
 */
import lesson34.Person;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Lesson35 {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>(List.of("Hello", "I", "love", "Java"));
        strList.add("too");
        strList.add("Java");
        System.out.println(strList);

        Set<String> strSet = new HashSet<>(List.of("Hello", "I", "love", "Java"));
        System.out.println(strSet.add("too"));
        System.out.println(strSet.add("Java"));
        System.out.println(strSet);

        Set<String> strLinkedSet = new LinkedHashSet<>(List.of("Hello", "I", "love", "Java"));
        System.out.println(strLinkedSet.add("too"));
        System.out.println(strLinkedSet.add("Java"));
        System.out.println(strLinkedSet);

        Person p1 = new Person("Mike", 35);
        Person p2 = new Person("Mike", 35);
        System.out.println(p1.equals(p2));

        HashTable<String, Person> strMap  = new HashTable<>();
        strMap.put("A120", new Person("Luke", 28));
        strMap.put("R16", new Person("Mark", 24));
        System.out.println(strMap);
        System.out.println(strMap.get("A120"));
        System.out.println(strMap.get("1F"));
    }
}
