package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class collectionsSorInbuilt {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(200);
        list.add(30);
        list.add(40);
        System.out.println("unsorted list :" + list);
        Collections.sort(list);
        System.out.println("sorted list :" + list);
        // compartor operation
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("reverse order :" + list);

    }
}
