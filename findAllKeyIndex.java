import java.util.ArrayList;

public class findAllKeyIndex {
    public static ArrayList<Integer> FindAllIndex(int arr[], int key, int idx) {
        ArrayList<Integer> list = new ArrayList<>();
        if (idx == arr.length) {
            return list;
        }

        if (arr[idx] == key) {
            list.add(idx);
        }
        ArrayList<Integer> AnsFromBellowCalls = FindAllIndex(arr, key, idx + 1);
        list.addAll(AnsFromBellowCalls);
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 33, 6, 4, 6, 8, 98, 66, 6, 6, 6 };
        int key = 6;
        for (int AA : FindAllIndex(arr, key, 0)) {
            System.out.print(AA + " ");
        }

    }
}
