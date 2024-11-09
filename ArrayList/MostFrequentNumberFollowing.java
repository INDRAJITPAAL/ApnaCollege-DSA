package ArrayList;

import java.util.ArrayList;

public class MostFrequentNumberFollowing {
    public static int findTargetWithMultipleOccurance(ArrayList<Integer> nums, int target) {
        int result[] = new int[1000];
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == target) {
                result[nums.get(i + 1) - 1]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] > max) {
                max = result[i];
                ans = i + 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        // nums = [1,100,200,1,100],
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);
        nums.add(1);
        int target = 1;
        System.out.println(findTargetWithMultipleOccurance(nums, target));

    }
}
