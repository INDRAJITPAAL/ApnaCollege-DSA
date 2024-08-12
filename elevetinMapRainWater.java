public class elevetinMapRainWater {
    public static int tRainWater(int hight[]) {
        int n = hight.length;
        // left max baundry
        int leftMaxb[] = new int[hight.length];
        leftMaxb[0] = hight[0];
        for (int i = 1; i < n; i++) {
            leftMaxb[i] = Math.max(hight[i], leftMaxb[i - 1]);
        }
        // right max baundry
        int rightMaxb[] = new int[hight.length];
        rightMaxb[hight.length - 1] = hight[hight.length - 1];
        for (int i = hight.length - 2; i >= 0; i--) {
            rightMaxb[i] = Math.max(hight[i], rightMaxb[i + 1]);
        }
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftMaxb[i], rightMaxb[i]);
            trappedWater += waterlevel - hight[i];

        }
        return trappedWater;

    }

    public static void main(String[] args) {
        int hight[] = { 4, 2, 0, 3, 2, 5};
        System.out.println(tRainWater(hight));
    }
}
