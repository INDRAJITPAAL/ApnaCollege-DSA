public class tillingProblem {
    public static int tillingProb(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // verticle way to put tilles on floor
        int fnm1 = tillingProb(n - 1);
        // horizontaly way to put tiles on floor
        int fnm2 = tillingProb(n - 2);

        int totalWay = fnm1 + fnm2;
        return totalWay;
    }

    public static void main(String[] args) {
        System.out.println(tillingProb(5));
    }
}
// ask by AMAZON