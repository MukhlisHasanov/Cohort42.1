package lesson38;

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
