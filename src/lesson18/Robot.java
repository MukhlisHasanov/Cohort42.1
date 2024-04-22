package lesson18;

/** AIT-TR, cohort 42.1, Java Basic, Lesson #18 Robot
 * @author Mukhlis_Hasanov
 * @version 23-Feb-2024
 */
public class Robot {

    public static final String COMPANY_NAME = "Boston Dynamics";


    private int countCPU;

    private int sum;

    private static int count;

    public Robot(int countCPU) {
        this.countCPU = countCPU;
        this.sum = 0;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int getSum() {
        return sum;
    }

    public void addAndSave(int a) {
        sum += a;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "countCPU=" + countCPU +
                '}';
    }
}
