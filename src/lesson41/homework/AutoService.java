package lesson41.homework;

public class AutoService {
    private AutoRepository autoRepository;

    public AutoService(AutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }

    public void add(String name, int year, String color, int price) {
        Car car = new Car(name, year, color, price);
        autoRepository.save(car);
    }

//    public void update(String name, int year, String color, int price) {
//        Car car = autoRepository.get(id);
//        if (car != null) {
//            car.setName(name);
//            autoRepository.save(car);
//        }
//    }

    public void remove(int id) {
        autoRepository.delete(id);
    }

    public void orderList() {
        autoRepository.findAll().forEach(System.out::println);
    }
}
