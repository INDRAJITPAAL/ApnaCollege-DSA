package ArrayList;

import java.util.ArrayList;

public class findMaxElementInArr {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(299);
        list.add(50);
        list.add(9);
        list.add(90);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
           max=Math.max(max, list.get(i));
        }
        // for (int i = 0; i < list.size(); i++) {
        //     if (list.get(i) > max) {
        //         max = list.get(i);
        //     }
        // }
        System.out.println(max);
    }
}
