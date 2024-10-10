import java.util.Arrays;

public class removeElementLetCode {
    public static int removeElement(int nums[], int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int arr[] = { 3,2,2,3 };
        int val = 3;
        int k = removeElement(arr, val);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, k)));

    }
}
