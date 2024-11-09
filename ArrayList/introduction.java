package ArrayList;

import java.util.ArrayList;

public class introduction {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add element in the arrayList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2, 40);
        System.out.println("add operation : " + list);
        // size of arrayList
        System.out.println("size of the arrayList" + list.size());
        // getElement from arrayList
        System.out.println("get operation : " + list.get(0));
        // remove operation
        list.remove(2);
        System.out.println("remove operation : " + list);
        // set operation
        list.set(2, 10);
        System.out.println("set operation : " + list);
        // contain operation
        System.out.println("contain operstion : " + list.contains(2));
        System.out.println("contain operstion : " + list.contains(22));

    }
}
