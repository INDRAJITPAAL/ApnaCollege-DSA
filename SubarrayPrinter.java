// Brute Force Approach
public class SubarrayPrinter {
    public static void printSubarrays(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }   

    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        printSubarrays(arr);
    }
}
