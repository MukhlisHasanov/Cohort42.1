package lesson41.homework;

import java.util.Scanner;

public class AutoController {
    private AutoService service;

    private Scanner scanner;
    public AutoController(AutoService service) {
        this.service = service;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        String[] input;
        String name, color;
        int year, price, id;
        char cmd = 0;
        do {
            System.out.println("CRUD app: [l]ist, [b]uy, [r]eturn, [p]rint, [e]xit: ");
            cmd = scanner.nextLine().charAt(0);
            switch (cmd) {
                case 'b':
                    System.out.println("Enter car name, car year, car color, car price ");
                    input = scanner.nextLine().split("&");
                    if (input.length > 1) {
                        id = Integer.valueOf(input[0].trim());
                        name = String.valueOf(input[1].trim());
                        year = Integer.valueOf(input[2].trim());
                        color = String.valueOf(input[3].trim());
                        price = Integer.valueOf(input[4].trim());
                        service.add(name, year, color, price);
                    } else {
                        if (Integer.valueOf(input[0].trim()) == 0) {
                            break;
                        }
                    }
                    break;
                case 'r':
                    System.out.println("Enter car name, car year, car color, car price ");
                    input = scanner.nextLine().split("&");
                    id = Integer.valueOf(input[0].trim());
                    name = input[1].trim();
//                    service.update(name, year);
                case 'p':
                case 'x':
                case 'l':
                    service.orderList();
                default:
                    System.out.println("Undefined command: " + cmd);
            }
        } while (cmd != 'x');
    }
}
