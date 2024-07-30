import java.util.*;

public class sub_array_sum {

    public static void printSubArray(int arr[]) {
        int i = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;

        while ((i < arr.length)) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                minSum = Math.min(minSum, sum);
                maxSum = Math.max(maxSum, sum);
            }

            i++;
        }
        // System.out.println("total subarray = " + (arr.length * (arr.length + 1)) /
        // 2);
        System.out.println("minsum is " + minSum);
        System.out.println("maxsum is " + maxSum);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printSubArray(arr);
    }
}
