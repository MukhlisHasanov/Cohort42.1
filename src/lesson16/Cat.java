package lesson16;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #16 Cat
 * @author Mukhlis_Hasanov
 * @version 19-Feb-2024
 */
public class Cat {
    public int maxVolume;

    public int realVolume;


    public Cat(String borya, int maxVolume, int i) {
        this.maxVolume = maxVolume;
        this.realVolume = 0;
    }

    public void eat(Plate plate) {
        int food = plate.amountFood();
        if (food > maxVolume - realVolume) {
            food = maxVolume - realVolume;
        }
        // TODO if cat eat all of food
        realVolume += food;
        plate.decreaseFood(food);
    }
}
