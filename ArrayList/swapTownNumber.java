package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class swapTownNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(100);
        System.out.println("unswaped element :" + list);
        int idx1 = 1;
        int idx2 = 4;
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        System.out.println("swaped element :" + list);
        // inbuilt function
        // Collections.swap(list,idx1,idx2);
        System.out.println(list);

    }
}
