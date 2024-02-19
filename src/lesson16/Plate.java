package lesson16;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #16 Plate
 * @author Mukhlis_Hasanov
 * @version 19-Feb-2024
 */
public class Plate {
    int capacity;

    int food;

    public Plate(int capacity) {
        this.capacity = capacity;
        this.food = 0;
    }

    public void add(int food) {
        //TODO check capacity
        this.food += food;
    }

    public int amountFood() {
        return food;
    }

    public void decreaseFood(int food) {
        this.food -= food;

    }
}
