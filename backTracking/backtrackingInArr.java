package backTracking;

import java.util.Arrays;

public class backtrackingInArr {
    public static void bc(int arr[], int i, int val) {
        if (i == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        arr[i] = val;
        bc(arr, i + 1, val + 1);
        arr[i]=arr[i]-2;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        bc(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }
}