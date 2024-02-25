package lesson16.homework;

import lesson16.Cat;
import lesson16.Plate;

/** AIT-TR, cohort 42.1, Java Basic, Homework #16
 * @author Mukhlis_Hasanov
 * @version 23-Feb-2024
 */
public class Homework16 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat( 20),
                new Cat(12),
                new Cat(25),
                new Cat(15)
        };
        Plate plate = new Plate(50);
        plate.add(40);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println("Cat:" + ((double)cat.realVolume/cat.maxVolume)*100 + "%");
        }

        // task #2
        Car car = new Car(40);
        PetrolStation station = new PetrolStation(1000);
        System.out.println("Car: " + car.fuel);
        System.out.println("Station: " + station.fuel);

        car.refuel(station);
        System.out.println("Car: " + car.fuel);
        System.out.println("Station: " + station.fuel);
    }
}
