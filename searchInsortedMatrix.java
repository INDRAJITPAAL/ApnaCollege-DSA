public class searchInsortedMatrix {
    // bottum to top
    public static boolean sortTwoDArr(int arr[][], int key) {
        int row = arr.length - 1;
        int col = 0;
        while (col <= arr[0].length && row >= 0) {
            if (arr[row][col] == key) {
                System.out.println("key found at (" + row + "," + col + ")");
                return true;
            } else if (arr[row][col] < key) {
                col++;
            } else {
                row--;
            }
        }
        System.out.println("key not found!");
        return false;

    }

    public static void main(String[] args) {
        // row and column should sorted
        int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 48 } };
        int key = 33;
        sortTwoDArr(arr, key);

    }
}
