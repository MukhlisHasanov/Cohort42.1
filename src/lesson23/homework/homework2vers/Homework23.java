package lesson23.homework.homework2vers;

import lesson23.homework.Warehouse;

/**
 * AIT-TR, cohort 42.1, Java Basic, Homework #23
 * @author Mukhlis hasanov
 * @version 8-Mar-24
 */
public class Homework23 {
    public static void main(String[] args) {
        lesson23.homework.Warehouse warehouse = new Warehouse();

        lesson23.homework.Product macbook = new lesson23.homework.Product("Laptop", 1000.0);
        lesson23.homework.Product iphone = new lesson23.homework.Product("Phone", 500.0);

        warehouse.receiveProduct(macbook, 10);
        warehouse.receiveProduct(iphone, 20);

        warehouse.shipProduct(macbook, 0);
        warehouse.orderProduct(iphone, 15);

        System.out.println("Available quantity of " + macbook.getProductName() + ": " + warehouse.getProductQuantity(macbook));
        System.out.println("Available quantity of " + iphone.getProductName() + ": " + warehouse.getProductQuantity(iphone));
    }
}

