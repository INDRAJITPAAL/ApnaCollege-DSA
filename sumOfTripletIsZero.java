import java.util.*;

public class sumOfTripletIsZero {
    public static void trilet(int nums[]) {
        Scanner sc = new Scanner(System.in);
        int idx = 0;
        int resultArr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                    
                    }
                }
            }
        }
        for (int A : resultArr) {
            System.out.print(A + " ");
        }

    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
       trilet(nums);
    }
}
