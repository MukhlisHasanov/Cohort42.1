package lesson11;

import java.util.Random;
import java.util.Scanner;

/** AIT-TR, cohort 42.1, Java Basic, Homework #11
 * @author Mukhlis_Hasanov
 * @version 08-Feb-2024
 */
public class Homework11 {

    static char[][] table = new char[3][3];
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static final char CHAR_EMPTY = '-';
    static final char CHAR_HUMAN = 'x';
    static final char CHAR_AI = 'o';

    public static void main(String[] args) {

        // init table (.)
        initTable();
        // main game loop
        while (true) {
            // human turn (x)
            turnHuman();
            // is human win? yes - game over
            if (isWin(CHAR_HUMAN)) {
                System.out.println("YOU WON!");
                break;
            }
            // is table fill? yes - game over
            if (isTableFull()) {
                System.out.println("Sorry, DRAW");
                break;
            }
            // AI turn (o)
            turnAI();
            // is AI win? yes - game over
            if (isWin(CHAR_AI)) {
                System.out.println("AI WON!");
                break;
            }
            // is table fill? yes - game over
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }

            // print table
            printTable();
        }
        // print table
        printTable();
        // define winner
    }

    static void initTable() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                table[y][x] = CHAR_EMPTY;
            }
        }
    }

    static void printTable() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.print(table[y][x] + " ");
            }
            System.out.println();
        }
    }

    static void turnHuman() {
        int x, y;
        do {
            System.out.println("Enter x & y [0..2]: ");
            x = scanner.nextInt();
            y = scanner.nextInt();
        } while(!isCellValid(x, y));
        table[y][x] = CHAR_HUMAN;
    }

    static void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[y][x] = CHAR_AI;
    }

    static boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[y][x] == CHAR_EMPTY;
    }

    static boolean isWin(char chr) {
        for (int i = 0; i < 3; i++) {
            if ((table[i][0] == chr && table[i][1] == chr && table[i][2] == chr)
                    || (table[0][i] == chr && table[1][i] == chr && table[2][i] == chr)) {
                return true;
            }
        }
            // by x
//        if (table[0][0] == chr && table[0][1] == chr && table[0][2] == chr) return true;
//        if (table[1][0] == chr && table[1][1] == chr && table[1][2] == chr) return true;
//        if (table[2][0] == chr && table[2][1] == chr && table[2][2] == chr) return true;
//
//        //by y
//        if (table[0][0] == chr && table[1][0] == chr && table[2][0] == chr) return true;
//        if (table[0][1] == chr && table[1][1] == chr && table[2][1] == chr) return true;
//        if (table[0][2] == chr && table[1][2] == chr && table[2][2] == chr) return true;

        //diagonals
        if ((table[0][0] == chr && table[1][1] == chr && table[2][2] == chr)
                || (table[0][2] == chr && table[1][1] == chr && table[2][0] == chr)) {
            return true;
        }
        return false;
    }

    static boolean isTableFull() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (table[y][x] == CHAR_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
