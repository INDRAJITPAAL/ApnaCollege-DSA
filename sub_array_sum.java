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
                    System.out.println(sum);
                }
                minSum = Math.min(minSum, sum);
                maxSum = Math.max(maxSum, sum);
            }

            i++;
        }
      
        System.out.println("minsum is " + minSum);
        System.out.println("maxsum is " + maxSum);

    }

    public static void main(String[] args) {
        int arr[] = { 1,-2,6,-1,3};
        printSubArray(arr);
    }
}
