public class findMajorityElementinArrayRecursion {
    public static int[] DivideArr(int arr[], int temp[], int idx) {
        if (idx == arr.length) {
            return temp;
        }

        // work
        if (arr[idx] >= 0 && arr[idx] <= 109) {
            temp[arr[idx]]++;
        }

        // recurence ralation
        DivideArr(arr, temp, idx + 1);
        return temp;

    }

    public static void findM(int temp[]) {
        int majorityValue = -1;
        int MAxValue = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > MAxValue) {
                MAxValue = temp[i];
                majorityValue = i;
            }

        }
        System.out.println(majorityValue);
    }

    public static void main(String[] args) {
        int arr[] = { 2,2,1,1,1,2,2,4,4,4,4,4 };
       int majorityIdxArr[]= DivideArr(arr, new int[110], 0);
       findM(majorityIdxArr);
    }
}
