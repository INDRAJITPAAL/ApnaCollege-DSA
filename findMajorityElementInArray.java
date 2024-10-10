import java.util.Arrays;

public class findMajorityElementInArray {
    public static void main(String[] args) {
        int arr[] = { 2,2,1,1,1,2,2 };
        int temp[] = new int[10];
        // increment the majority value index inside temp arr
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 9) {
                temp[arr[i]]++;
            }
        }
        // find max value inside temp array
        int maxValue = 0;
        int majorityIdx = -1;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > maxValue) {
                maxValue = temp[i];
                majorityIdx=i;
            }
        }

        // printing majority element in the array
        
        
        System.out.println(majorityIdx);
    }
}
