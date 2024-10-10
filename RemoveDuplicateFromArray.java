import java.util.*;

public class RemoveDuplicateFromArray {

    public static int removeDublicate(int nums[]) {
        int idx = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 3 };
        int k = removeDublicate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
