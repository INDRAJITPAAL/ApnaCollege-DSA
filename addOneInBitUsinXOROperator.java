public class addOneInBitUsinXOROperator {
    public static int add1(int num) {
        int BitMask = 1;
        while ((num & BitMask) != 0) {
            num = num ^ BitMask;
            BitMask <<= 1;
        }
        num = num ^ BitMask;

        return num;
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println(add1(num));
    }
}
