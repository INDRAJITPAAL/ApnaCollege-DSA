public class RotatedArraySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Determine which side is properly sorted
            if (nums[left] <= nums[mid]) { // Left side is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // Target is in the left side
                } else { 
                    left = mid + 1; // Target is in the right side
                }
            } else { // Right side is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // Target is in the right side
                } else {
                    right = mid - 1; // Target is in the left side
                }
            }
        }
 
        return -1; // Target not found
    }

    public static void main(String[] args) {
        RotatedArraySearch searcher = new RotatedArraySearch();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
         System.out.println("Index of target: " + searcher.search(nums, target)); // Output: 4
    }
}
