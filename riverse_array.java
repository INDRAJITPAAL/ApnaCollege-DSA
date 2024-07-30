public class riverse_array {
    public static int[] riverseArr(int arr[]) {
        int riverseA[] = new int[arr.length];
        int count = 0;
        for (int  i = arr.length - 1; i >= 0; i--,count++) {
            riverseA[count] = arr[i];
           
        }
        return riverseA;
    }

    public static void main(String[] args) {
        //time o(n)
        //space o(n)
int arr[]={1,2,3,4,5,6,7};
for(int A:riverseArr(arr)){
    System.out.print(A+" ");
}
    }
}
