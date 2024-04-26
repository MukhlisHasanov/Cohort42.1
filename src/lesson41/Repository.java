package lesson41;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Repository {
private Map<Integer, Product> carMap;

    public Repository(Map<Integer, Product> carMap) {
        this.carMap = carMap;
    }

    public void save(Product product) {
    carMap.put(product.getId(), product);
    }

    public Product get(int id) {
        return carMap.get(id);
    }



    public boolean delete(int id) {
        return carMap.remove(id) != null;
    }

    public void initCar() {
        List<Product> products = new ArrayList<>(List.of(
            new Product("Mazda rx-7", 1996, "Orange", 30000)

        ));
    }
}
