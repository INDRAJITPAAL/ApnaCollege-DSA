public class BitwiseOperatorsDemo {
    public static void main(String[] args) {
        int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011

        // Bitwise AND
        int andResult = a & b; // Binary: 0001, Decimal: 1
        System.out.println("a & b = " + andResult);

        // Bitwise OR
        int orResult = a | b; // Binary: 0111, Decimal: 7
        System.out.println("a | b = " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b; // Binary: 0110, Decimal: 6
        System.out.println("a ^ b = " + xorResult);

        // Bitwise NOT
        int notResult = ~a; // Binary: 1010 (in 32-bit: 11111111111111111111111111111010), Decimal: -6
        System.out.println("~a = " + notResult);

        // Left Shift
        int leftShiftResult = a << 1; // Binary: 1010, Decimal: 10
        System.out.println("a << 1 = " + leftShiftResult);

        // Right Shift
        int rightShiftResult = a >> 1; // Binary: 0010, Decimal: 2
        System.out.println("a >> 1 = " + rightShiftResult);
    }
}
