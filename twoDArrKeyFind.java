

public class twoDArrKeyFind {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4,  6 }, { 7, 8, 9 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int key = 6;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == key) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}