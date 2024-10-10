import java.util.*;
public class mergeSortRecursion {
    public static int[] mergeSort(int arr[]) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int left[] = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);

    }

    public static int[] merge(int first[], int second[]) {
        int sortedArr[] = new int[first.length + second.length];
        int k = 0;

        int i = 0;
        int j = 0;
        // comparing two array element
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                sortedArr[k++] = first[i++];

            } else {
                sortedArr[k++] = second[j++];
            }
        }
        // remaining first array element in the array
        while (i < first.length) {
            sortedArr[k++] = first[i++];
        }
        // remaining second element in the array
        while (j < second.length) {
            sortedArr[k++] = second[j++];
        }
        return sortedArr;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 2, 6, 5, 3, 7 };
        int ans[] = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }
}
