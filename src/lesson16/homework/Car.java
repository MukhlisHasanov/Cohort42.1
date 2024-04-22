package lesson16.homework;

import lesson16.Plate;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #16 Car
 * @author Mukhlis_Hasanov
 * @version 19-Feb-2024
 */
public class Car {

    double maxFuel;

    double fuel;

    public Car(double maxFuel) {
        this.maxFuel = maxFuel;
    }

    public void refuel(PetrolStation station) {
        double toGet = station.decreaseFuel(maxFuel - fuel);
        fuel += toGet;
    }
}