public class binaryStringProblem {
    public static void bStr(int n, int lastBit, String bString) {
        if (n == 0) {
            System.out.println(bString);
            return;
        }
        // kam
        bStr(n - 1, 0, bString + "0");
        if (lastBit == 0) {
            bStr(n - 1, 1, bString + "1");
        }
    }

    public static void main(String[] args) {
        bStr(3, 0, "");
    }
}
//ask by paytm