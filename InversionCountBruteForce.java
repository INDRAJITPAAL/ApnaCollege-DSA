public class InversionCountBruteForce {

    // Function to count inversions using brute force
    public static int countInversions(int[] arr) {
        int count = 0;

        // Loop through each element of the array
        for (int i = 0; i < arr.length - 1; i++) {
            // Compare the current element with all elements after it
            for (int j = i + 1; j < arr.length; j++) {
                // If arr[i] is greater than arr[j], it's an inversion
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 5 };
        int result = countInversions(arr);
        System.out.println("Number of inversions are: " + result);
    }
}
