package lesson9;

import java.util.Arrays;
import java.util.Random;

/**
 * AIT-TR, cohort 42.1, Java Basic, Homework #9
 * @author Mukhlis_Hasanov
 * @version 07-Feb-2024
 */

public class Homework9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        // task 1
        task1(5);

        //task 2
        printArray(array);

        //task 3
        printArray(array, false);
        printArray(array, true);

        //task 4
        System.out.println(Arrays.toString(calculateArray(array)));

    }
    static void task1(int n) {
        for (int i = 1; i <= n ; i++) {
            System.out.println("Task" + i);
        }
    }

    static void printArray(int[] a) {
        for (int i = a.length - 1; i > -1; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static void printArray(int[] a, boolean reverseDirection) {
        if (reverseDirection) {
            printArray(a);
        } else {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static int[] createRandomArray(int len, int bound) {
        int[] a = new int[len];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(bound);
        }
        return a;
    }

    static double[] calculateArray(int[] a) {
        int max = a[0];
        int min = a[0];
        double average = 0;
        for (int i: a) {
            average += i;
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        double[] result = {min, max, average / a.length};
        return result;
    }
}