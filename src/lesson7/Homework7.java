package lesson7;

import java.util.Random;
import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, Homework #7
 * @author Mukhlis_Hasanov
 * @version 30-Jan-2024
 */
public class Homework7 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        do {
            int guess = -1;
            int count = 0;
            int number = random.nextInt(10);
            //main game loop
            while (guess != number && count < 3) {
                System.out.println("Enter the number [0..9]: ");
                guess = scanner.nextInt();
                if (guess != number) {
                    System.out.println("Your guess " + ((guess > number) ? "greater" : "less"));
                    count++;
                }
            }
            //show the result of game
            System.out.println("You " + ((guess == number) ? "WIN!" : "Lose: " + number));
        } while (scanner.nextInt() == 1);
    }
}