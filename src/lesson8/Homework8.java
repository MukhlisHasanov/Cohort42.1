package lesson8;

import java.util.Arrays;
import java.util.Random;

/**
 * AIT-TR, cohort 42.1, Java Basic, Homework #8
 * @author Mukhlis_Hasanov
 * @version 01-Feb-2024
 */
public class Homework8 {
    public static void main(String[] args) {

        // Task 1
        for (int i = 1; i < 11; i++) {
            System.out.println("Task" + i);
        }

        //Task 2
        int[] numbers = new int[20];
        Random random = new Random();
        System.out.println("Numbers divided by 5 without remainder:");
        for ( int i =0; i < 20; i++) {
            numbers[i] = random.nextInt(100);
            if ((numbers[i] % 5) == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Array values: " + Arrays.toString(numbers));

        //Task 3
        String[] array = {"Apple", "Banana", "Elephant", "Guitar", "Sunshine", "Mountain", "Ocean", "Butterfly"};
        int iMax = 0;
        int max = array[0].length();
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > max) {
                max = array[i].length();
                iMax = i;
            }
        }
        for (int m = 0; m < max; m++) {
            System.out.println(array[iMax].charAt(m));
        }

        //Task 4
        int[] arrayInt = new int[20];
        Random random2 = new Random();

        for ( int i =0; i < arrayInt.length; i++) {
            arrayInt[i] = random2.nextInt(100);
        }
        System.out.println("\nArray values: " + Arrays.toString(arrayInt));

        int maxNumber = arrayInt[0];
        int minNumber = arrayInt[0];
        double average = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > maxNumber) {
                maxNumber = arrayInt[i];                // Maximum of array
            }
            if (arrayInt[i] < minNumber) {
                minNumber = arrayInt[i];                // Minimum of array
            }
            average += arrayInt[i];
        }
        average /= arrayInt.length;                     // Average of array
        System.out.println("Minimum of array: " + minNumber);
        System.out.println("Maximum of array: " + maxNumber);
        System.out.println("Average of array: " + average);
    }
}