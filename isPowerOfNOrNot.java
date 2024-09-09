public class isPowerOfNOrNot {
    public static boolean isPowerOrnot(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
System.out.println(isPowerOrnot(8));
    }
}
