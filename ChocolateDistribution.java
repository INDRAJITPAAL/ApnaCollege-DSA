import java.util.Arrays;

public class ChocolateDistribution {

    public static int findMinDifference(int[] chocolates, int n, int m) {
        // Edge case: If there are no students or not enough packets
        if (m == 0 || n == 0 || m > n) {
            return 0;
        }

        // Sort the array
        Arrays.sort(chocolates);

        // Initialize the minimum difference
        int minDifference = Integer.MAX_VALUE;

        // Find the minimum difference between the max and min in each subset of size m
        for (int i = 0; i + m - 1 < n; i++) {
           minDifference=Math.min(minDifference, chocolates[i+m-1]-chocolates[i]);
        }

        return minDifference;
    }

    public static void main(String[] args) {
        int[] chocolates = {3, 4, 1, 9, 56, 7, 9, 12};
        int n = chocolates.length;
        int m = 5; // Number of students

        int result = findMinDifference(chocolates, n, m);
        System.out.println("The minimum difference is: " + result);
    }
}
