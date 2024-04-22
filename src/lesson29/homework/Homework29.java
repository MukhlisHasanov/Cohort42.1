package lesson29.homework;

/**
 * AIT-TR, Cohort42.1, Java Basic Homework #29
 * @author Muklis Hasanov
 * @version 26-Mar-24
 */
public class Homework29 {
    public static void main(String[] args) {
        RubberList rubberList = new RubberList();
        rubberList.add(7);
        rubberList.add(4);
        rubberList.add(12);
        rubberList.add(1);
        rubberList.add(-5);
        System.out.println(rubberList);
        System.out.println(rubberList.get(2));
        rubberList.remove(2);
        System.out.println(rubberList);
        rubberList.remove(0);
        System.out.println(rubberList);
        rubberList.remove(rubberList.size() - 1);

    }
}
