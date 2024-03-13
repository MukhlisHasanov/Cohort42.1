package lesson25.homework;

/**
 *  AIT-TR, cohort 42.1, Java Basic, Homework #25
 *  @author Mukhlis hasanov
 *  @version 13-Mar-24
 */
public class Homework25 {
    public static void main(String[] args) {
        // task #1
        Human[] humans = {new Human(10, 15), new RunnerAmateur(15, 10), new RunnerProf(25, 5)};
        for (Human human : humans) {
            System.out.println(human.run());
        }
        // task #2
        Vehicle[] vehicles = {new Car(), new Biicycle(), new ElectroBike(), new Motorcycle()};
        for (Vehicle v : vehicles) {
            System.out.println(v.startEngine());
        }
//        // task #3
//        Figure[] figures = {new Circle(5), new Square(5)};
//        for (Figure f = figures) {
//            System.out.println(f.calcArea());
//        }
    }
}
