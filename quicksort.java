import java.util.Arrays;

public class quicksort {
    public static void qs(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int povIdx = partition(arr, si, ei);
        qs(arr, si, povIdx - 1);
        qs(arr, povIdx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 7, 2 };
        qs(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
