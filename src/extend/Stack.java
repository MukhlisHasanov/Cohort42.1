package extend;

import java.util.Arrays;

/**
 * AIT-TR, cohort 42.1, Java Basic, Homework #12 ext
 * @author Mukhlis_Hasanov
 * @version 12-Feb-2024
 */
public class Stack {

    static int[] stack = new int[10];
    static int idx = 0;

    public static void push(int value) {
        if (idx < stack.length) {
            stack[idx] = value;
            idx++;
        } else {
            throw new RuntimeException("Stack overflow");
        }
    }

    public static Integer pop() {
        if (idx > 1) {
            idx--;
            return stack[idx];
        }
        return null;
    }

    public static String print() {
        return Arrays.toString(Arrays.copyOf(stack, idx));
    }
}
