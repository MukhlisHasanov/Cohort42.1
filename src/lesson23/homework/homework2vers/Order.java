package lesson23.homework.homework2vers;

import java.util.ArrayList;
import java.util.List;
class Order {
    private int orderId;
    private List<ToWarehouse> items;

    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
    }

//    public int getOrderId() {
//        return orderId;
//    }
//
//    public void setOrderId(int orderId) {
//        this.orderId = orderId;
//    }
//
//    public List<ToWarehouse> getItems() {
//        return items;
//    }
//
//    public void setItems(List<ToWarehouse> items) {
//        this.items = items;
//    }

    public void addItem(ToWarehouse item) {
        items.add(item);
    }
}
