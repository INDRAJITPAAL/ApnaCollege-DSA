public class zeroToNRecursion {
    public static void f(int n) {
        if (n == -1) {
            return;
        }
        System.out.println(n);
        f(n - 1);
    }

    public static void main(String[] args) {
        f(10);
    }
}
