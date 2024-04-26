package lesson41;

public class Service {

    private int id;
    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public void add(String name, int year, String color, int price) {
        Product product = new Product(name, year, color, price);
        repository.save(product);
    }

    public void update(String name, int year, String color, int price) {
        Product product = repository.get(id);
        if (product != null) {
            product.setName(name);
            repository.save(product);
        }
    }
}
