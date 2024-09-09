import java.util.Arrays;

public class mergeSort {

    public static void mergeSorts(int arr[], int i, int mid, int j) {
        int p1 = i;
        int p2 = mid + 1;
        int hArr[] = new int[j - i + 1];
        int idx = 0;
        while (p1 <= mid && p2 <= j) {
            if (arr[p1] < arr[p2]) {
                hArr[idx++] = arr[p1];
                p1++;
            } else {
                hArr[idx++] = arr[p2];
                p2++;
            }

        }
        while(p1<=mid){
            hArr[idx++] = arr[p1];
            p1++;
        }
        while(p2<=j){
            hArr[idx++] = arr[p2];
            p2++;
        }

    }

    private static void divide(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int mid = (i + j) / 2;
        divide(arr, i, mid);
        divide(arr, mid + 1, j);
        mergeSorts(arr, mid, i, j);
    }

    public static void main(String[] args) {
        int arr[] = { 7, 6, 2, 1, 9, 5, 4, 3, 8 };
        System.out.println(Arrays.toString(arr));
        divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

}
