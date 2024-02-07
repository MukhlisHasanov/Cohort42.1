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

       //task 1
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

//        do {
//            int guess = -1;
//            int count = 0;
//            int number = random.nextInt(10);
//            //main game loop
//            while (guess != number && count < 3) {
//                System.out.println("Enter the number [0..9]: ");
//                guess = scanner.nextInt();
//                if (guess != number) {
//                    System.out.println("Your guess " + ((guess > number) ? "greater" : "less"));
//                    count++;
//                }
//            }
//            //show the result of game
//            System.out.println("You " + ((guess == number) ? "WIN!" : "Lose: " + number));
//        } while (scanner.nextInt() == 1);

        //task 2
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
        // define simple variables
        int damageRadius = 10;
        double g = 9.81;
        int angle;
        int speed;
        double difference;
        // generate distance to target
        double distance = random.nextInt(1000) + 100;
        do {
            //enter speed & angle
            System.out.println("Enter start speed (m/s):");
            speed = scanner.nextInt();
            System.out.println("Enter angle (°) [0..89°]:");
            angle = scanner.nextInt();
            // calculate
            double realDistance = speed * speed * Math.sin(Math.toRadians(angle * 2)) / g;
            difference = distance - realDistance;
            // analize
            if (Math.abs(difference) < damageRadius) {
                System.out.println("You damage target!: " + realDistance);
            } else {
                if (difference < 0) {
                    System.out.println("Overflight: " + realDistance + " " + distance);
                } else {
                    System.out.println("Underflight: " + realDistance + " " + distance);
                }
            }
        } while (Math.abs (difference) > damageRadius);
    }
}