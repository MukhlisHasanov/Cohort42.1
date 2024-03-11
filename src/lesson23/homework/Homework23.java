package lesson23.homework;

/**
 * AIT-TR, cohort 42.1, Java Basic, Homework #23
 * @author Mukhlis hasanov
 * @version 8-Mar-24
 */
public class Homework23 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Product laptop = new Product("Laptop", 1000.0);
        Product phone = new Product("Phone", 500.0);

        warehouse.receiveProduct(laptop, 10);
        warehouse.receiveProduct(phone, 20);

        warehouse.shipProduct(laptop, 0);
        warehouse.orderProduct(phone, 15);

        System.out.println("Available quantity of " + laptop.getProductName() + ": " + warehouse.getProductQuantity(laptop));
        System.out.println("Available quantity of " + phone.getProductName() + ": " + warehouse.getProductQuantity(phone));
    }
}

