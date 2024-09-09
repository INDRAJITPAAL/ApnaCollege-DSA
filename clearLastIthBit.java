public class clearLastIthBit {
    public static int clearLastIthBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        // clear last beat means starting index of i
        System.out.println(clearLastIthBits(15, 2));
    }
}
