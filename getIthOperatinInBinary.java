public class getIthOperatinInBinary {
    public static int getIthBit(int n, int i) {
        // left shifting 1 with i times
        int bitMask = 1 << i;
        // finding ith element 1 or 0 right left indexing in binary
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int i = 3;
        System.out.println(getIthBit(n, i));
    }
}
