package lesson23.homework.homework2vers;

import java.util.ArrayList;
import java.util.List;
class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void processOrder(Order order, List<FromWarehouse> shipments) {
        // Логика обработки заказа и отгрузки товара
    }
}