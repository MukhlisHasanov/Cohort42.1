package lesson23.homework;

public class StockOperation {

    private Product product;
    private int quantity;
    private OperationType operationType;

    public StockOperation(Product product, int quantity, OperationType operationType) {
        this.product = product;
        this.quantity = quantity;
        this.operationType = operationType;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public OperationType getOperationType() {
        return operationType;
    }
}
