package extend;

import java.util.Arrays;
import java.util.Scanner;

/** AIT-TR, cohort 42.1, Java Basic, Homework #10 ext
 * @author Mukhlis_Hasanov
 * @version 08-Feb-2024, 23-Feb-24
 */
public class Interpreter {

    static int[] values = new int[26];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        do {
            System.out.print("# ");
            line = scanner.nextLine();
            String[] tokens = line.split(" ");
            //System.out.println(Arrays.toString(tokens));
            switch (tokens[0]) {
                case "print":
                    printValue(tokens[1]);
                    break;
                case "exit":
                    System.out.println("Exit from interpreter");
                    break;
                default:
                    assignValue(line);
            }
        } while (!line.equals("exit"));
    }
    static void assignValue(String line) {
        String[] tokens = line.split("=");
        String varName = tokens[0].trim();
        String varValue = tokens[1].trim();
        // check variable name

        }
        // transform 'a' -> 0
        int idx = varName.charAt(0) - 'a';
        // transform "123" -> 123
        int value = Integer.valueOf(varValue);
        // assign value
        values[idx] = value;
    }

    static void printValue(String varName) {
        if (validateVarName(varName)) {
            return;
        }
        // transform 'a' -> 0
        int idx = varName.charAt(0) - 'a';
        // print value of variable
        System.out.println(values[idx]);
    }

    static boolean validateVarName(String varName) {
        // check variable name length
        if (varName.length() > 1) {
            System.out.println("Error variable name is too long");
            return false;
        }
        if (varName.length()) {
            System.out.println("Error variable name is too long");
            return false;
        }
        // TODO check if variable name in 'a'..'z'
        return true;
    }
}

