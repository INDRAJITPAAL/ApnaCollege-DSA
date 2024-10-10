public class StringSortingMergeSort {
   public static void compareStringSort(String arr[], int si, int ei) {

      if (si >= ei) {
         return;
      }
      int mid = si + (ei - si) / 2;
      compareStringSort(arr, si, mid);
      compareStringSort(arr, mid + 1, ei);
      StrMerge(arr, si, mid, ei);

   }

   public static void StrMerge(String arr[], int si, int mid, int ei) {
      String temp[] = new String[ei - si + 1];
      int k = 0;
      // for left index
      int left = si;
      // for right index
      int right = mid + 1;
      // for comparing left side to right side string
      while (left <= mid && right <= ei) {
         if (arr[left].compareTo(arr[right]) < 0) {
            temp[k++] = arr[left++];
         } else {
            temp[k++] = arr[right++];
         }
      }
      // for remaining String element in left array
      while (left <= mid) {
         temp[k++] = arr[left++];
      }
      // for right side string element in the array
      while (right <= ei) {
         temp[k++] = arr[right++];
      }
      // for pasting temp array to original array
      for (int idx = si, i = 0; i < temp.length; i++, idx++) {
         arr[idx] = temp[i];
      }
   }

   public static void main(String[] args) {
      String arr[] = { "sun", "earth", "mars", "mercury" };
      compareStringSort(arr,0,arr.length-1);
   for(String ss:arr){
      System.out.print(ss+" ");
   }

   }
}
