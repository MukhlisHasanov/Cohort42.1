package lesson26.homework;

/**
 * AIT-TR, Cohort42.1, Java Basic Homework #26
 * @author Muklis Hasanov
 * @version 15-Mar-24
 */
public class Homework26 {
    public static void main(String[] args) {
        double sumArea = 0;
        double sumPerimeter = 0;
        Figure[] figures = {new Circle(5), new Triangle(5, 5, 11), new Rectangle(4, 5)};
        for (Figure figure : figures) {
            sumArea += figure.calcArea();
            sumPerimeter += figure.calcPerimeter();
            System.out.println(figure.calcArea());
        }
        System.out.println("allArea: " + sumArea + ", allPerimeter: " + sumPerimeter);
    }
}
