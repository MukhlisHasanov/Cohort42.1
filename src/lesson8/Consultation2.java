package lesson8;

import java.util.Arrays;
import java.util.Random;

public class Consultation2 {
    public static void main(String[] args) {
//        Random random = new Random();
//        int[] a = new int [10];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = random.nextInt(11);
//            System.out.println("a[" + i + "] = " + a[i]);
//        }
//        System.out.println(Arrays.toString(a));
        String[] tokens = new String[10];
        int idx = 0;
        String number = "";
        String exp = "16+23-1+8";
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            switch (ch) {
                case '+', '-', '*', '/':
                    tokens[idx] = number;
                    tokens[idx + 1] = String.valueOf(ch);
                    idx+= 2;
                    number = "";
                    break;
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
                    number += ch;
                    break;
            }
        }
        if (!number.isEmpty()) {
            tokens[idx] = number;
            idx++;
        }
        System.out.println(Arrays.toString(tokens));
        System.out.println(idx);
    }
}
