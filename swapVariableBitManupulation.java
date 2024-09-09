public class swapVariableBitManupulation {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        // Swapping using XOR
        a = a ^ b; // a becomes 15 (binary XOR)
        b = a ^ b; // b becomes 5
        a = a ^ b; // a becomes 10

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
