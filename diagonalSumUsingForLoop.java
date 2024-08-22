public class diagonalSumUsingForLoop {

    public static void twoD(int arr[][]) {
        // matrix should be n*n
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                } else if ((i + j) == arr.length-1) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.println(sum);

    }

    public static void optimizedCode(int arr[][]){
        int sum=0;
        // for primary diagonal
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
            if(i!=arr.length-i-1){
                sum+=arr[i][arr.length-1-i];
            }

        }
        //for secondary diagonal

        System.out.println(sum);
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
                optimizedCode(arr);

    }
}
