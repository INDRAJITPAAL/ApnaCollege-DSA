public class findFirstOccurenceNumber {
    public static int fOccur(int arr[], int key, int i) {
        if (arr[i] == key) {
            return i;
        }
        if (i == arr.length - 1) {
            return -1;
        }
        return fOccur(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 29, 40 };
        System.out.println(fOccur(arr, 40, 0));
    }
}
