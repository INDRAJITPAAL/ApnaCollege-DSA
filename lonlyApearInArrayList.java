import java.util.ArrayList;
import java.util.Collections;

public class lonlyApearInArrayList {
    public static ArrayList<Integer> lonlyElem(ArrayList<Integer> nums){
        Collections.sort(nums);
        ArrayList<Integer> ansList=new ArrayList<>();
        //sorted 1,3,3,5;
        // Check each number
        for (int i = 0; i < nums.size(); i++) {
            boolean isLonely = true;
            
            // Check the previous number (if it exists)
            if (i > 0 && (nums.get(i) == nums.get(i-1) || nums.get(i) == nums.get(i-1) + 1)) {
                isLonely = false;
            }

            // Check the next number (if it exists)
            if (i < nums.size() - 1 && (nums.get(i) == nums.get(i+1) || nums.get(i) == nums.get(i+1) - 1)) {
                isLonely = false;
            }
            
            // Add to the list if the number is lonely
            if (isLonely) {
                ansList.add(nums.get(i));
            }
        } 
        
        return ansList;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        //1,3,5,3
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);
        System.out.println(lonlyElem(nums));
    }
}