package lesson4;

import java.util.Scanner;

/** AIT-TR, cohort 42.1, Java Basic, Homework #4
 * @author Mukhlis_Hasanov
 * @version 22-Jan-2024
 */

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String a = scanner.next();
        System.out.println("What is your surname?");
        String b = scanner.next();
        System.out.println("Where are you live?");
        String c = scanner.next();
        System.out.println("How old are you?");
        int d = scanner.nextInt(); // We can use String, but I just wanna try int
        System.out.println("What is your height?");
        int e = scanner.nextInt();
        System.out.println("Let's check:");
        System.out.println("You are " + a + " " + b + ", " + "you are " + d + " years old" + ", " + "you live in " + c + ", " + "and your height is " + e + ", " + "is it correct?");
    }
}
