package lesson15;

import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, Homework #15 (Cat)
 * @author Mukhlis_Hasanov
 * @version 18-Feb-2024
 */
public class Car {
    Scanner scan = new Scanner(System.in);
    public int fuelLevel, productionYear, fuel, fuelConsumption = 10;
    public String brand, color, engine;

    public Car(String carBrand, String carColor, int carAge, int tankVolume) {
        this.fuelLevel = tankVolume;
        this.brand = carBrand;
        this.color = carColor;
        this.productionYear = carAge;
    }

    public void carInfo() {
        System.out.println("Hi! I wanna present your new car!");
        System.out.println("Lady & Gentleman, thiiiis is a " + brand + " " + productionYear);
        System.out.println(color + "! With " + fuelLevel + "-litres tank!");
    }

    public void drive() {
        System.out.println("How many km do you wanna drive [10...700]");
        fuel = scan.nextInt() / fuelConsumption;
        if (fuel < fuelLevel) {
            fuelLevel -= fuel;
            System.out.println("Fuel level after driving is " + getFuelLevel() + " litres");
        } else {
            fuelLevel = 0;
            System.out.println("Tank is empty! Please refuel");
        }
    }

    public void refuel() {
        System.out.println("How many litres do you wanna refuel? ");
        fuel = scan.nextInt();
        if (fuelLevel + fuel > 70) {
            System.out.println("OVERLOAD FUEL! Please, get your change " + (fuelLevel + fuel - 70) * 2 + "$");
            fuelLevel = 70;
            System.out.println("Fuel level after refueling is 70 litres" );
        } else {
            fuelLevel += fuel;
            System.out.println("Fuel level after refueling is " + getFuelLevel() + " litres");
        }
    }

    public void startEngine() {
        System.out.println("Engine is started. You have " + fuelLevel + " litres.");
    }

    public void carVoice() {
        System.out.println();
        System.out.println("Vroom vroom... vroom vroom...");
    }

    public int getFuelLevel() {
        return fuelLevel;
    }
}
