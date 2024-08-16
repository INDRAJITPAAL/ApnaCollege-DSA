

public class sub_array {
    public static void subArraySum(int arr[]) {
        int maxSum = 0;
        int i = 0;
        while ((i < arr.length)) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                    maxSum = Math.max(maxSum, sum);
                }
                System.out.println("maximum is =" + sum);

            }
            i++;
        }
        System.out.println("minimum sum is = " + maxSum);
    }

    public static void printSubArray(int arr[]) {
        int i = 0;

        while ((i < arr.length)) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
            i++;
        }
        System.out.println("total subarray = " + (arr.length * (arr.length + 1)) / 2);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        subArraySum(arr);
    }
}
