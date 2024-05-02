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
            System.out.println("CRUD app: [l]ist, [a]dd, [b]uy, e[x]it: ");
            cmd = scanner.nextLine().charAt(0);
            switch (cmd) {
                case 'a':
                    System.out.println("Enter car name, car year, car color, car price ");
                    input = scanner.nextLine().split("&");
                    name = input[0].trim();
                    year = Integer.valueOf(input[1].trim());
                    color = input[2].trim();
                    price = Integer.valueOf(input[3].trim());
                    service.add(name, year, color, price);
                    break;
                case 'b':
                    System.out.println("Enter car id: ");
                    id = Integer.valueOf(scanner.nextLine());
                    service.remove(id);
                    break;
                case 'x':
                    break;
                case 'l':
                    service.orderList();
                    break;
                default:
                    System.out.println("Undefined command: " + cmd);
            }
        } while (cmd != 'x');
    }
}
