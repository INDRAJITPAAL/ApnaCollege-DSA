public class maxNumberIntwoDArr {
    public static void maxInArr(int arr[][] ){
        int maxN=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>maxN){
                    maxN=arr[i][j];
                }
            }
        }
        System.out.println(maxN);
    }

    public static void main(String[] args) {
        int tArr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        maxInArr(tArr);

    }
}
