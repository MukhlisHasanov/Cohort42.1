package lesson27;

/**
 * AIT-TR, Cohort42.1, Java Basic Lesson #27
 * @author Muklis Hasanov
 * @version 15-Mar-24
 */
public class Lesson27 {
    public static void main(String[] args) {
        Figure[] figures = {new Circle(5), new Rectangle(3, 4), new Triangle(4, 5, 3)};
        for (Figure figure : figures) {
            System.out.println(figure.getClass().getSimpleName());
            System.out.println(figure.calcArea());
            System.out.println(figure.calcPerimeter());
        }
    }
}
