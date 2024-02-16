package lesson12;

/**
 * AIT-TR, cohort 42.1, Java Basic, Homework #12
 * @author Mukhlis_Hasanov
 * @version 12-Feb-2024
 */
public class Homework12 {
    public static void main(String[] args) {

        //task #1
        int[] array;
        int p = linearSearch(new int[]{1, 8, 12, -4, 6, 3, 7, -3}, 3);
        System.out.println(p);
    }

    public static int linearSearch(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                return i;
            }
        }
        return -1;
    }
}

    //task#2
//
//    selectionSort(array);
//    System.out.println(array);

    //task #3
//
//    public static int binarySearch(int[] a, int n) {
//        int left = 0, right = a.length - 1;
//        while (left + 1 != right) {
//            int middle = left + (right - left) / 2;
//            if (a[middle] == n) {
//                return middle;
//            }
//            if (a[middle] > n) {
//                right = middle;
//            } else {
//                left = middle;
//            }
//        }
//        return -1;
//    }
//    int[] array = {64, 25, 12, 22, 11};
//
//        System.out.println("Исходный массив:");
//    printArray(array);
//
//    selectionSort(array);
//
//        System.out.println("\nОтсортированный массив:");
//    printArray(array);
//}
//
//static void selectionSort(int[] a) {
//    for (int i = 0; i < a.length - 1; i++) {
//        int min = a[i];
//        int minIdx = i;
//        for (int j = i + 1; j < a.length; j++) {
//            if (a[j] < min) {
//                min = a[j];
//                minIdx = j;
//            }
//        }
//        if (a[i] > min) {
//            a[minIdx] = a[i];
//            a[i] = min;
//        }
//    }
//}
//
//static void printArray(int[] arr) {
//    for (int i = 0; i < arr.length; i++) {
//        System.out.print(arr[i] + " ");
//    }
//    System.out.println();
//}
