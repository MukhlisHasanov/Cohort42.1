package lesson43.homework43;

/**
 * AIT-TR, Cohort42.1, Java Basic Homework #43
 * @author Muklis Hasanov
 * @version 27-Apr-24
 */
public class Homework43 {
    public static void main(String[] args) {
        // test1: normal
        String[][] matrixOk = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        System.out.println(calculateArray(matrixOk));
        // test2: bad size
        String[][] matrixBadSize = {{"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        try {
            System.out.println(calculateArray(matrixBadSize));
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        // test3: bad data
        String[][] matrixBadData = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9E", "10", "11", "12"}, {"13", "14", "15", "16"}};
        try {
            System.out.println(calculateArray(matrixBadData));
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    static int calculateArray(String[][] matrix) {
        int sumMatrix = 0;
        // check matrix size
        if (matrix.length > 4) {
            throw new MyArraySizeException("matrix.length > 4");
        }

        // calculate matrix
        for (int row = 0; row < matrix.length; row++) {
            // check size all row-array
            if (matrix[row].length != 4) {
                throw new MyArraySizeException("matrix.row[" + row + "] != 4");
            }
            for (int column = 0; column < matrix[row].length; column++) {
                String element = matrix[row][column];
                    // convert String to int
                    // added sumMatrix
                    try {
                        sumMatrix += Integer.valueOf(element);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("row: " + row + ", column: " + column + ", bad element: " + element);
                }
            }
        }
        return sumMatrix;
    }
}
