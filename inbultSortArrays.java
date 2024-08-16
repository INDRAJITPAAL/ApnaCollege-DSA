import java.util.Arrays;

import java.util.Collections;


public class inbultSortArrays {
    public static void main(String[] args) {
        Integer arr[] = { 4, 2, 4, 45, 12, 1 };
        Arrays.sort(arr,0,3,Collections.reverseOrder());// time complexity would be big O(nLog(n))
        for (int A : arr) {
            System.out.print(A + " ");
        }
    }
}
