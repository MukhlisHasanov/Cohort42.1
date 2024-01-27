package lesson3;

public class Homework3 {
    public static void main(String[] args) {
        //task #1
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int k = 4;
        int e = 5;
        int f = 6;
        int g = 7;
        int h = 8;
        int i = 9;
        // We should enter double for correct answer
        double m = (a + b + c + d + e + f + g + h + i + k) / 10.; {
            System.out.println("1. Average of 'm' is " + m);
        }
        //task #2
        int productA = 1000;
        int productB = 500;
        int discount = (productA + productB) / 10;
        int price = productA + productB - discount; {
            System.out.println("2. Total price with discount is " + ((productA + productB) - discount) + " EURO");
        }
        //task #3
        double Mn = 8.2;
        double Tu = 7.5;
        double Wn = 6.5;
        double Th = 8.1;
        double Fr = 5.5;
        double St = 7.2;
        double Sn = 8.8; {
            System.out.println("3. Average temperature in Baku is " + Math.round(((Mn + Tu + Wn + Th + Fr + St + Sn) / 7.0) * 100.0) / 100.0);
        }
       //task #4
    }
}
