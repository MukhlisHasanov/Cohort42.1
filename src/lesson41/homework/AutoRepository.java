package lesson41.homework;

import java.util.*;

public class AutoRepository {
    private Map<Integer, Car> carMap;

    public AutoRepository() {
        carMap = new HashMap<>();
    }

    public void save(Car car) {
    carMap.put(car.getId(), car);
    }

    public Car get(int id) {
        return carMap.get(id);
    }

    public Collection<Car> findAll() {
        return carMap.values();
    }

    public boolean delete(int id) {
        return carMap.remove(id) != null;
    }

    public void initCar() {
        List<Car> cars = new ArrayList<>(List.of(
            new Car("Mazda rx-7", 1996, "Orange", 30000),
            new Car("Toyota Supra MK4", 1998, "Silver", 80000),
            new Car("Nissan Skyline GT-R R34", 1999, "Blue", 120000),
            new Car("Honda NSX", 1995, "Red", 70000),
            new Car("Subaru Impreza WRX STI", 2000, "White", 40000),
            new Car("Mitsubishi Lancer Evolution VI", 1999, "Yellow", 35000),
            new Car("Mazda RX-7 FD", 1997, "Black", 45000),
            new Car("Toyota Celica GT-Four", 1994, "Green", 25000),
            new Car("Nissan Silvia S15", 2002, "Purple", 30000),
            new Car("Subaru Legacy B4 RSK", 1998, "Dark Blue", 20000),
            new Car("Mitsubishi 3000GT VR-4", 1999, "Silver", 18000)
        ));
        cars.forEach(car -> save(car));
    }
}
