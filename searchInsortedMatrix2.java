public class searchInsortedMatrix2 {
    // top to bottum
    public static boolean sortTwoDArr(int arr[][], int key) {
        int row = 0;
        int col = arr[0].length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("foud at cell (" + row + "," + col + ")");
                return true;
            } else if (key < arr[row][col]) {
                col--;

            } else {
                row++;
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
