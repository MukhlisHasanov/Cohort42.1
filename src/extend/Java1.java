package extend;

import java.util.Scanner;

public class Java1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); {
            if (age >= 21) {
                System.out.println("Which vodka do you want? ");
                scanner.nextLine();
            } else {
                System.out.println("Sorry, we can't sell alcohol to you");
            }
        }
    }
}
