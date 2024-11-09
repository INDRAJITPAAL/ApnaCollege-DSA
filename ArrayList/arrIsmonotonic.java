package ArrayList;

import java.util.ArrayList;

public class arrIsmonotonic {
    public static boolean misMonotonic(ArrayList<Integer> list) {
        boolean isMonoIncreasing = true;
        boolean isMonoDeccreasing = true;
        for (int i = 0; i < list.size() - 1; i++) {
            // for increasing order
            if (list.get(i) < list.get(i + 1)) {
                isMonoIncreasing = false;
            }
            // for decreasing order
            if (list.get(i) > list.get(i + 1)) {
                isMonoDeccreasing = false;
            }
            if (isMonoIncreasing == false && isMonoDeccreasing == false) {
                return isMonoIncreasing || isMonoDeccreasing;
            }
        }
        return isMonoIncreasing || isMonoDeccreasing;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // nums = [6,5,4,4]
        list.add(6);
        list.add(5);
        list.add(0);
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println(misMonotonic(list));
    }
}
