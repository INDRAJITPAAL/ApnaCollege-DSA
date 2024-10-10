public class SearchInsertPositio {
    public static int SearchIdx(int nums[], int target) {
        int si = 0;
        int ei = nums.length - 1;
      
        while (si <= ei) {

            int mid = si + (ei - si) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (target < nums[mid]) {
                ei = mid - 1;

            } else {
                si = mid + 1;

            }

        }

        return si;
    }

    public static void main(String[] args) {
        // logn time complexity should have this algorithm
        int arr[] = { 1, 3, 5, 6 };
        int target = 7;
        System.out.println(SearchIdx(arr, target));

    }
}

// important