package lesson8;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #8
 * @author Mukhlis_Hasanov
 * @version 31-Jan-2024
 */
public class Lesson8 {
    public static void main(String[] args) {
        int[] array = {7, 2, -5, 11, 1};
        array[0] = 12;
        System.out.println(array[2]); //null
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
//        for (int i = 4; i > -1; i--) {
//            System.out.println(i);
//        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
        for (int i : array) {
            System.out.println(i + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
