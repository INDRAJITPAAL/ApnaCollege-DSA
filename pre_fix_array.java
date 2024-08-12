import java.util.*;

public class pre_fix_array {
    public static void prefixArray(int arr[]) {

        int prefixarr[] = new int[arr.length];
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        
        // prefix sum
        prefixarr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixarr[i] = prefixarr[i - 1] + arr[i];
        }
        // sum of subarray

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;

                currSum = start == 0 ? prefixarr[end] : prefixarr[end] - prefixarr[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        prefixArray(arr);
    }
}
