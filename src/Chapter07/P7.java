package Chapter07;

import java.util.Scanner;
import java.util.ArrayList;

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
        int size = input.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter " + size + " elements: ");

        fillArray(numbers, input, size);
        System.out.println("The average is " + average(numbers, size));
        System.out.print("The contents of the array is: ");
        System.out.println(numbers);
    }

    /**
     * collects numbers and stores them in array
     *
     * @param numbers the amount of numbers that the user is going to put into
     * @param size the size of the array list
     * the array
     * @param input allows for user to input
     */
    public static void fillArray(ArrayList<Integer> numbers, Scanner input, int size) {
        for (int i = 0; i < size; i++) {
            numbers.add(i, input.nextInt());
        }
    }

    /**
     * calculator for average
     *
     * @param numbers the amount of numbers that the user is going to put into
     * @param size the size of the array list
     * the array
     * @return calculated average
     */
    public static double average(ArrayList<Integer> numbers, int size) {
        double sum = 0;

        for (int i = 0; i < size; i++) {
            sum = sum + numbers.get(i);
        }

        return sum / size;
    }
}
