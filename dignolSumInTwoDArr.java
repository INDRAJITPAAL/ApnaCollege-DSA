public class dignolSumInTwoDArr {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i][i];
            i++;
        }
        i = 0;
        int j = arr.length - 1;
        while (i < arr.length) {
            if (i != j) {
                sum += arr[i][j];
            }
            i++;
            j--;
        }
        System.out.println(sum);
    }
}
