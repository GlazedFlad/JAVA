package Chapter07;

import java.util.Scanner;

/**
 * Program to determine letter grade based on number grade
 *
 * @author Vincent Breckenridge
 */
public class C7_1 {

    public static void main(String[] args) {
        /**
         * Main Method
         *
         * @param args arguments from command line prompt
         */
        Scanner input = new Scanner(System.in);
        // Create the array
        System.out.print("Enter the number of students: ");
        int[] scores = new int[input.nextInt()];

        // Fill array with scores
        System.out.print("Enter " + scores.length + " scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }

        // Determine the highest score
        int highestScore = bestScore(scores);

        // Display output
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + determineGrade(scores[i], highestScore));
        }
    }

    /**
     * bestScore Method determines the best score from the total scores
     *
     * @param scores an array of all of the students scores
     * @return highest score of all of the students
     */
    public static int bestScore(int[] scores) {
        int best = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > best) {
                best = scores[i];
            }
        }

        return best;
    }

    /**
     * determineGrade Method determines letter grade
     *
     * @param score what the student got on assignment
     * @param best best score between students
     * @return either A, B, C, D, or F based on the difference from the best
     * score
     */
    public static char determineGrade(int score, int best) {
        if (score >= best - 10) {
            return 'A';
        } else if (score >= best - 20) {
            return 'B';
        } else if (score >= best - 30) {
            return 'C';
        } else if (score >= best - 40) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
