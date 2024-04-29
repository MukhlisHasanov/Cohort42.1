package lesson41.homework;

import java.util.Scanner;

/**
 * AIT-TR, Cohort42.1, Java Basic Homework #41
 * @author Muklis Hasanov
 * @version 24-Apr-24
 */
public class Homework41 {
    public static void main(String[] args) {
        AutoRepository repository = new AutoRepository();
        AutoService service = new AutoService(repository);
        repository.initCar();
        new AutoController(service).run();
    }
}
