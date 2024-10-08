import java.util.Arrays;

public class mergeSort {

    public static void mergeSorT(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSorT(arr, si, mid);
        mergeSorT(arr, mid + 1, ei);
        merge(arr, si, mid, ei);

    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        
        // Merging the two halves
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        
        // Copy remaining elements from the left half, if any
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        
        // Copy remaining elements from the right half, if any
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        
        // Copy sorted elements back to original array
        for (k = 0, i =si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {6,4,6,2,1};
        mergeSorT(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

}
