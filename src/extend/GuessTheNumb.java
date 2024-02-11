package extend;

import java.util.Random;
import java.util.Scanner;

/** AIT-TR, cohort 42.1, Java Basic, Self-work #1
 * @author Mukhlis_Hasanov
 * @version 11-Feb-2024
 */

public class GuessTheNumb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int count = 0;
        int guess = -1;
        int aiNumb = random.nextInt();
        aiNumb = random.nextInt(10);
        do {
        while (count < 3 && guess !=aiNumb) {
            System.out.println("Enter a number [0..9]: ");
            guess = scanner.nextInt();

        if (guess != aiNumb) {
            System.out.println("Your number is: " + ((guess > aiNumb) ? "higher" : "less"));
            count++;
        }
    }
        System.out.println("You " + ((guess == aiNumb)? "WIN!" : "LOSE!" + " The number was - " + aiNumb));
        System.out.println("Repeat game? Yes - 1, No - 0");
        } while (scanner.nextInt() == 1);
    }
}
