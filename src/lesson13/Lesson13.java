package lesson13;

import lesson12.Homework12;
import lesson12.Lesson12;
import lesson9.Homework9;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #13
 * @author Mukhlis_Hasanov
 * @version 12-Feb-2024
 */
public class Lesson13 {
    public static void main(String[] args) {
        int[] array = Homework9.createRandomArray(100_000, 100);

        long startTime = System.currentTimeMillis();
        System.out.println(Homework12.linearSearch(array, 45));
        System.out.println((System.currentTimeMillis() - startTime) + " ms");

        Lesson12.selectionSort(array);

        startTime = System.currentTimeMillis();
        System.out.println(Homework12.binarySearch(array, 45));
        System.out.println(System.currentTimeMillis() - startTime + " ms");


    }
}
