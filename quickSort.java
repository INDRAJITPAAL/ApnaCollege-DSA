import java.util.*;

public class quickSort {
    public static void quickSrt(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pIdx = merge(arr, si, ei);
        quickSrt(arr, si, pIdx - 1);
        quickSrt(arr, pIdx + 1, ei);

    }

    public static int merge(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 88, 5, 2, 3, 6, 7, 0 };
        quickSrt(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
