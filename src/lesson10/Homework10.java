package lesson10;

import java.util.Scanner;

public class Homework10 {
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
        // transform 'a' -> 0
        int idx = varName.charAt(0) - 'a';
        // transform "123" -> 123
        int value = Integer.valueOf(varValue);
        // assign value
        values[idx] = value;
    }

    static void printValue(String varName) {
        int idx = varName.charAt(0) - 'a';
        System.out.println(values[idx]);
    }
}
