public class clearIthBitOperationInBinary {
    public static int clearIth(int n, int i) {
        int bitMas = ~(1 << i);
        return (n & bitMas);

    }

    public static void main(String[] args) {
        System.out.println(clearIth(10, 1));
    }
}
