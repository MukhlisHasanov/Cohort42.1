package lesson41.homework;

import java.util.HashMap;
import java.util.Map;

public class AutoService {

    private int id;
    private AutoRepository autoRepository;
    Map<Integer, Car> orderList;

    public AutoService(AutoRepository autoRepository) {
        this.autoRepository = autoRepository;
        orderList = new HashMap<>();
    }

    public void add(String name, int year, String color, int price) {
        Car car = autoRepository.get(id);
        if (car != null) {
            autoRepository.delete(id);
        }
    }

    public void update(String name, int year, String color, int price) {
        Car car = autoRepository.get(id);
        if (car != null) {
            car.setName(name);
            autoRepository.save(car);
        }
    }

    public void remove(int id, String name) {
        Car car = autoRepository.get(id);
        autoRepository.save(car);
    }

    public void orderList() {
        System.out.println(autoRepository);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nOrder list: ");
        orderList.forEach((Integer, car) -> {
            sb.append(car).append("\n");
        });
        return sb.toString();
    }
}
