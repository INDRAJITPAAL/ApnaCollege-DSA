
public class pr {
    public static void subArraySum(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + ",");
                    sum += arr[k];
                }
                System.out.println(" -> sum is = " + sum);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        subArraySum(arr);
    }
}
