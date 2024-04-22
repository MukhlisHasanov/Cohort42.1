package lesson19;

/** AIT-TR, cohort 42.1, Java Basic, Homework #19
 * @author Mukhlis_Hasanov
 * @version 27-Feb-2024
 */
public class Homework19 {
    public static void main(String[] args) {
        RubberArrayHW ra = new RubberArrayHW();
        ra.add(8);
        ra.add(12);
        ra.add(-1);
        ra.add(8);
        ra.add(25);
        System.out.println(ra);
        System.out.println(ra.get(2));
        ra.remove(2);
        System.out.println(ra);
    }
}
