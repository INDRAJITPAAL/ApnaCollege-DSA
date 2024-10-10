public class countInversionOnArray {
    public static void inversionCount(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        inversionCount(arr, si, mid);
        inversionCount(arr, mid + 1, ei);


    }

    public static void inverCount(int arr[], int si, int mid, int ei) {
        // for left side arr index
        int left = si;
        // for right side array index
        int right = mid + 1;

        while (left <= mid && right <= ei) {
            if (arr[left] > arr[right]) {
                count++;
            }
        }

    }

    static int count = 0;

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5 };
        inversionCount(arr, 0, arr.length - 1);
        System.out.println(count);
    }
}
