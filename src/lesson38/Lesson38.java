package lesson38;

/**
 * AIT-TR, Cohort42.1, Java Basic Lesson #38
 * @author Muklis Hasanov
 * @version 13-Apr-24
 */
public class Lesson38 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableClass());
        Thread t2 = new Thread(new RunnableClass());
        Thread t3 = new Thread(new RunnableClass());
        t1.start();
        t2.start();
        t3.start();
    }
}
