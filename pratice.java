import java.util.Arrays;

public class pratice {
    public static void main(String[] args) {
        int arr[] = { 7,3,2,4,9,12,56 };
        Arrays.sort(arr);
        int m = 3;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if ((i + m - 1) < arr.length) {
                ans = Math.min(ans, arr[i + m - 1] - arr[i]);

            }
        }

        System.out.println(ans);

    }
}
