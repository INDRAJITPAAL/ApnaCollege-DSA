public class trappedRainWater {
    public static int trappedRainWater(int hight[]) {
        // helping array

        // leftmax
        int leftMax[] = new int[hight.length];
        leftMax[0] = hight[0];
        for (int i = 1; i < hight.length; i++) {
            leftMax[i] = Math.max(hight[i], leftMax[i - 1]);
        }

        // rightMax
        int rightMax[] = new int[hight.length];
        rightMax[hight.length - 1] = hight[hight.length - 1];
        for (int i = hight.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(hight[i], rightMax[i + 1]);
        }

        // finding total water trapped water
        int trappedWater = 0;
        for (int i = 0; i < hight.length; i++) {

            // water level
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trappedWater
            trappedWater += waterLevel - hight[i];
        }
        return trappedWater;

    }

    public static void main(String[] args) {

        int hight[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedRainWater(hight));

    }
}