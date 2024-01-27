package lesson6;

import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #6
 * @author Mukhlis_Hasanov
 * @version 26-Jan-2024
 */
public class Lesson6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1, 2 or 3:");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Wrong number!");
        }
    }
}
