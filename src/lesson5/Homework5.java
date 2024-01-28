package lesson5;

import java.util.Random;
import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, Homework #5
 * @author Mukhlis_Hasanov
 * @version 28-Jan-2024
 */

public class Homework5 {
    public static void main(String[] args) {

        //task #1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int m = scanner.nextInt();
        boolean a = m % 2 == 0;
        boolean b = m % 3 == 0;
        boolean c = a && b;
        System.out.println("1. Number " + m + " is odd: " + a + ", div by 3: " + b + ", odd and div by 3: " + c);

        //task #2
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter 1, 2 or 3");
        String str = scanner1.next();
        if (str.equals("1")) {
            System.out.println("2. One");
        } else if (str.equals("2")) {
            System.out.println("2. Two");
        } else if (str.equals("3")) {
            System.out.println("2. Three");
        } else {
            System.out.println("2. Wrong number");
        }

        //task #3
        Random random = new Random();
        int n1 = random.nextInt(101);
        int n2 = random.nextInt(101);
        int n3 = random.nextInt(101);
        int n4 = random.nextInt(101);
        int n12 = n1 < n2 ? n2 : n1;
        int n34 = n3 < n4 ? n4 : n3;
        int max = n12 < n34 ? n34 : n12;
        System.out.println("3. " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", max: " + max);

        //task #4
        String str2 = "1450";
        if (str2.length() == 4) {
            n1 = str2.charAt(0) - '0';
            n2 = str2.charAt(1) - '0';
            n3 = str2.charAt(2) - '0';
            n4 = str2.charAt(3) - '0';
            System.out.println(n1 + n2 == n3 + n4 ? "4. Lucky number" : "4. Unlucky number");
        } else {
            System.out.println("Wrong input: " + str);
        }
    }
}
