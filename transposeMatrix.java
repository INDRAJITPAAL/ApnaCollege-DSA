
public class transposeMatrix  {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int m = arr[0].length;
        int n = arr.length;
        int trArr[][] = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                trArr[j][i] = arr[i][j];
            }
        }
        System.out.println("------");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               System.out.print( trArr[i][j]+" ");
            }
            System.out.println();
        }

    }
}