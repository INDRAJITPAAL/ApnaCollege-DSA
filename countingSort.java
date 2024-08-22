public class countingSort {
    public static void cSort(int[] arr) {

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(arr[i], largest);
        }

        // increasing count
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // sorting

        int j = 0;
        for (int i = 0; i < count.length; i++) {
           if(count[i]>0){
            arr[j++] = i;
            count[i]--;
           }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 121, 33, 2 };
        cSort(arr);
        for (int A : arr) {
            System.out.print(A + " ");
        }
    }
}
