package ArrayList;

import java.util.ArrayList;

public class containerWithMostWaterTwoPinterAproach {

    // two pinter aoproach
    public static int containMostWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {
            // calculation of are of container
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int mostWater = ht * width;
            maxWater = Math.max(mostWater, maxWater);
            // ptr update
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(containMostWater(height));
    }
}
