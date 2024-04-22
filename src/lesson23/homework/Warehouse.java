package lesson23.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Product> products;
    private List<StockOperation> stockOperations;

    public Warehouse() {
        this.products = new ArrayList<>();
        this.stockOperations = new ArrayList<>();
    }

    public void receiveProduct(Product product, int quantity) {
        products.add(product);
        StockOperation operation = new StockOperation(product, quantity, OperationType.RECEIPT);
        stockOperations.add(operation);
    }

    public void shipProduct(Product product, int quantity) {
        if (products.contains(product) && getProductQuantity(product) >= quantity) {
            StockOperation operation = new StockOperation(product, quantity, OperationType.SHIPMENT);
            stockOperations.add(operation);
        } else {
            System.out.println("Insufficient quantity of " + product.getProductName() + " in stock.");
        }
    }

    public void orderProduct(Product product, int quantity) {
        StockOperation operation = new StockOperation(product, quantity, OperationType.ORDER);
        stockOperations.add(operation);
    }

    public int getProductQuantity(Product product) {
        int quantity = 0;
        for (StockOperation operation : stockOperations) {
            if (operation.getProduct().equals(product)) {
                if (operation.getOperationType() == OperationType.RECEIPT) {
                    quantity += operation.getQuantity();
                } else if (operation.getOperationType() == OperationType.SHIPMENT) {
                    quantity -= operation.getQuantity();
                }
            }
        }
        return quantity;
    }
}

