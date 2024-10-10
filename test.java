import java.util.Arrays;

public class test {
    public static int pow2(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfSq = pow2(a, n / 2);
        if (n % 2 == 0) {
            return halfSq * halfSq;
        } else {
            return halfSq * halfSq * a;
        }
    }

    public static void main(String[] args) {
        System.out.println(pow2(2, 2));
    }
}