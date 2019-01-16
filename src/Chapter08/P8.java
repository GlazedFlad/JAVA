package Chapter08;

import java.util.Scanner;

/**
 * Takes a given matrix and sums up the numbers in a column
 *
 * @author Chase Holland
 */
public class P8 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] x = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                x[row][column] = input.nextDouble();
            }
        }

        for (int column = 0; column < 4; column++) {
            System.out.println("Sum of the elements at column " + column + " is " + sumColumn(x, column));
        }
    }

    /**
     * Sums up the numbers in a column
     *
     * @param m A placeholder for which part of the column you are on
     * @param columnIndex The index of the column of the given array
     * @return Returns a double
     */
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0.0;
        for (int row = 0; row < m.length; row++) {
            sum = sum + m[row][columnIndex];
        }
        return sum;
    }
}
