public class rotatedSearchArrayRecursion {
    public static int srchArr(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        // case target in between si to mid
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target <= arr[mid]) {
                return srchArr(arr, target, si, mid - 1);
            } else {
                return srchArr(arr, target, mid + 1, ei);
            }

        } else if (arr[mid] >= target && target <= arr[ei]) {
            return srchArr(arr, target, mid + 1, ei);
        } else {
            return srchArr(arr, target, si, ei - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 0, 1, 2 };
        int target = 7;
        System.out.println(srchArr(arr, target, 0, arr.length-1));
    }
}
