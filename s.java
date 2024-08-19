import java.util.Arrays;

public class s {
    public static void sort(int[] arr) {
        // counting sort=cm
        // findin max element in the array
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int counting[] = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            counting[arr[i]]++;

        }

        int idx = 0;
        for (int i = 0; i < counting.length; i++) {
            while (counting[i] > 0) {
                arr[idx++] = i;
                counting[i]--;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 2, 1, 5, 7, 5, 3, 7, 8 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}