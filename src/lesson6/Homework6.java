package lesson6;

import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, Homework #6
 * @author Mukhlis_Hasanov
 * @version 29-Jan-2024
 */

public class Homework6 {
    public static void main(String[] args) {

        //task #1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1, 2 or 3");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("1. One");
                break;
            case 2:
                System.out.println("1. Two");
                break;
            case 3:
                System.out.println("1. Three");
                break;
            default:
                System.out.println("1. Wrong number");
        }

        //task #2
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7");
        int day = scanner2.nextInt();
        switch (day) {
            case 1:
                System.out.println("2. Monday");
                break;
            case 2:
                System.out.println("2. Tuesday");
                break;
            case 3:
                System.out.println("2. Wednesday");
                break;
            case 4:
                System.out.println("2. Thursday");
                break;
            case 5:
                System.out.println("2. Friday");
                break;
            case 6,7:
                System.out.println("2. Weekend");
                break;
            default:
                System.out.println("2. Entered wrong number");
        }

        //task #3
        int i = 1;
        while (i <= 10) {
            System.out.println("3. Task" + i);
            i++;
        }

        //task #4
        int l = 1;
        do {
           if (l % 5 == 0) {
               System.out.println("4. " + l);
           }
            l++;
        } while (l < 101);

        //task #5
        Scanner scan = new Scanner(System.in);
        String input;
        String secretWord = "hello";
        int attempts = 0;

        do {
            System.out.println("Enter a 'hello': ");
            input = scan.nextLine();
            attempts++;
            if (!input.equals(secretWord)) {
                System.out.println("Wrong word! Try again");
            }
        } while (!input.equals(secretWord));

        System.out.println("Good job!");
        System.out.println("Count of tries: " + attempts);
    }
}