public class arrn_pair {
    public static void printPairs(int arr[]) {
        int i = 0;

        while (i < arr.length ) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("[" + arr[i] + "," + arr[j] + "]");
            }
            i++;
            System.out.println();
        }
        System.out.println("total pairs would be = "+(arr.length*(arr.length-1))/2);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printPairs(arr);
    }
}
