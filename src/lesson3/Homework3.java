package lesson3;

/** AIT-TR, cohort 42.1, Java Basic, Homework3
 * @author Mukhlis_Hasanov
 * @version 28-Jan-2024
 */

public class Homework3 {
    public static void main(String[] args) {
        
        //task #1
        int a = 0, b = 1, c = 1, d = 1, e = 1, f = 1,k = 1, g = 1, h = 1, i = 1;
        // We should enter double for correct answer
        double m = (a + b + c + d + e + f + g + h + i + k) / 10.;
        System.out.println("1. Average of 'm' is " + m);

        //task #2
        int productA = 1000;
        int productB = 500;
        int discount = (productA + productB) / 10;
        int price = productA + productB - discount;
        System.out.println("2. Total price with discount is " + ((productA + productB) - discount) + " EURO");

        //task #3
        double Mn = 8.2, Tu = 7.5, Wn = 6.5, Th = 8.1, Fr = 5.5, St = 7.2, Sn = 8.8;
        System.out.println("3. Average temperature in Baku is " + Math.round(((Mn + Tu + Wn + Th + Fr + St + Sn) / 7.0) * 100.0) / 100.0);

       //task #4
        int a3 = 9 % 2;
        int b3 = 10 % 2;
        int c3 = 11 % 2;
        System.out.println("4. " + a3 + ", " + b3 + ", " + c3);
        System.out.println("   " + (9 % 3) + ", " + (10 % 3) + ", " + (11 % 3) + ", " + (12 % 3));

        //task #5
        int x = 3;
        x += x++;
        System.out.println("5. " + x);
    }
}
