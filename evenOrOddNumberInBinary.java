public class evenOrOddNumberInBinary {
    public static void oddOrEven(int n) {
        // last bit of n in binary
        int bitMask = 1;
        // finding in last bit 0 or 1 if lastBit=0 then even else odd
        if ((n & bitMask) == 0) {
            System.out.println("even number ");
        } else {
            System.out.println("odd number ");
        }
    }

    public static void main(String[] args) {
        int n = 12;
        oddOrEven((n));
    }
}
