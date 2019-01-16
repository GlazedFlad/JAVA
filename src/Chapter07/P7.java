package Chapter07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to create an array, calculate average and display the newly created
 * array
 *
 * @author Gregory Sage
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Create the array
        System.out.print("How many numbers will be read: ");
        int[] numbers = new int[input.nextInt()];

        fillArray(numbers, input);
        System.out.println("The average is " + average(numbers));
        displayArray(numbers);
    }

    /**
     * collects numbers and stores them in array
     *
     * @param numbers the amount of numbers that the user is going to put into
     * the array
     * @param input allows for user to input
     */
    public static void fillArray(int[] numbers, Scanner input) {
        System.out.print("Enter " + numbers.length + " elements: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
    }

    /**
     * calculator for average
     *
     * @param numbers the amount of numbers that the user is going to put into
     * the array
     * @return calculated average
     */
    public static double average(int[] numbers) {
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        return sum / numbers.length;
    }

    /**
     * displays the full array
     *
     * @param numbers the amount of numbers that the user is going to put into
     * the array
     */
    public static void displayArray(int[] numbers) {
        System.out.println("The contents of the array: " + Arrays.toString(numbers));
    }
}
