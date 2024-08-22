public class TransposeOfMatrix {
    public static void Transpose(int arr[][]) {
        int arr2[][]=new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr2[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        

    }

    public static void main(String[] args) {
        int arr[][] = { { 11, 12, 13 }, { 21, 22, 23 } };
        Transpose(arr);
    }
}
