package HW1;
import java.util.Random;
public class AnalyzeScores {

    // Method to display scores (10 per line)
    public static void displayScores(int[] scores) {
        System.out.println("Scores");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");

            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Method to compute average
    public static double computeAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    // Method to count scores >= average
    public static int countAboveAverage(int[] scores, double avg) {
        int count = 0;
        for (int score : scores) {
            if (score >= avg) {
                count++;
            }
        }
        return count;
    }

    // BONUS: count scores in ranges (0–9, 10–19, ..., 90–99)
    public static void countRanges(int[] scores) {
        int[] ranges = new int[10]; // 10 ranges

        for (int score : scores) {
            ranges[score / 10]++;
        }

        System.out.println("\nCounts of scores in each range:");
        for (int i = 0; i < ranges.length; i++) {
            System.out.println((i * 10) + "-" + (i * 10 + 9) + ": " + ranges[i]);
        }
    }

    public static void main(String[] args) {
        int[] scores = new int[100];
        Random rand = new Random();

        // Generate 100 random scores (0–99)
        for (int i = 0; i < scores.length; i++) {
            scores[i] = rand.nextInt(100); // 0 to 99
        }

        // Display scores
        displayScores(scores);

        // Compute average
        double avg = computeAverage(scores);
        System.out.printf("\nAverage Scores: %.2f\n", avg);

        // Count scores >= average
        int aboveAvg = countAboveAverage(scores, avg);
        System.out.println("Above average Scores: " + aboveAvg);

        // Count ranges (Bonus)
        countRanges(scores);
    }
}