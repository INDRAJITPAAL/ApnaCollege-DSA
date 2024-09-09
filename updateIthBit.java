public class updateIthBit {
    public static int clearIth(int n, int i) {
        int bitMas = ~(1 << i);
        return (n & bitMas);

    }

    public static int setrIth(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int updateIthBitIn(int n, int i, int newBit) {
        // n = clearIth(n, i);
        // int BitMask = newBit << i;
        // return n | BitMask;

        if (newBit == 0) {
            return clearIth(n, i);
        } else {
            return setrIth(n, i);

        }
    }

    public static void main(String[] args) {
        System.out.println(updateIthBitIn(10, 2, 1));
    }
}
