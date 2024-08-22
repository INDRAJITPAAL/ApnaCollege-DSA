public class spiralMatrix {
    public static void printSpiral(int arr[][]) {
        int startRow = 0;
        int endRow = arr.length - 1;
        int startcol = 0;
        int endcol = arr[0].length - 1;
        while (startcol <= endcol && startRow <= endRow) {

            // top
            for (int i = startcol; i <= endcol; i++) {
                System.out.print(arr[startRow][i] + " ");
            }
            startRow++;
            // right side
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(arr[i][endcol] + " ");
            }
            endcol--;
            // bottum
            for (int i = endcol; i >= startcol; i--) {
                System.out.print(arr[endRow][i] + " ");
            }
            endRow--;

            // left side

            for (int i = endRow; i >= startRow; i--) {
                System.out.print(arr[i][startcol] + " ");
            }
            startcol++;

        }

    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12}};
               
        printSpiral(arr);
    }
}
