//package lesson41;
//
//import java.util.Scanner;
//
//public class Controller {
//    private Service service;
//
//    private Scanner scanner;
//    public Controller(Service service) {
//        this.service = service;
//        this.scanner = new Scanner(System.in);
//    }
//
//    public void run() {
//        String[] input;
//        String name, color;
//        int year, price;
//        char cmd = 0;
//        do {
//            System.out.println("CRUD app: [a]dd, [u]pdate, [d]elete, [p]rint, [e]xit: ");
//            cmd = scanner.nextLine().charAt(0);
//            switch (cmd) {
//                case 'a':
//                    System.out.println("Add: car name: ");
//                    name = scanner.nextLine();
//                    service.add(name, year, color, price);
//                case 'u':
//                    System.out.println();
//                    input = scanner.nextLine().split("&");
//                    id = Integer.valueOf(input[0].trim());
//                    name = input[1].trim();
//                    service.update(name, year);
//                case 'd':
//                case 'p':
//                case 'x':
//                default:
//                    System.out.println("Undefined command: " + cmd);
//            }
//        } while (cmd != 'x');
//    }
//}
