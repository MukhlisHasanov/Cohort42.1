package lesson23.homework.homework2vers;

import java.util.ArrayList;
import java.util.List;
public class WarehouseSystem {
    public static void main(String[] args) {
        // Пример использования классов
        Product laptop = new Product(1, "Laptop", 1200.0, 50);
        ToWarehouse toWarehouse = new ToWarehouse(laptop, 10);

        Product smartphone = new Product(2, "Smartphone", 500.0, 30);
        ToWarehouse anotherToWarehouse = new ToWarehouse(smartphone, 20);


        Order order = new Order(1);
        order.addItem(toWarehouse);
        order.addItem(anotherToWarehouse);

        Manager warehouseManager = new Manager("John Doe");
        List<FromWarehouse> shipments = new ArrayList<>();
        warehouseManager.processOrder(order, shipments);

        

        laptop.displayInfo();
        smartphone.displayInfo();
    }
}
