public class checkArrSortedOrNotIncreasingRecursion {
    public static boolean arrSortedOrNot(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] >= arr[idx + 1]) {
            return false;
        }
        return arrSortedOrNot(arr, idx + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 6, 7 };
        if (arrSortedOrNot(arr, 0)) {
            System.out.println("arr is sorted");
        } else {
            System.out.println("arr is not sorted");
        }
    }
}
