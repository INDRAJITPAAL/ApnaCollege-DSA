public class setIthValueInBinary {
    public static int setrIth(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(setrIth(10, 2));
    }
}
