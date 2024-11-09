package dpPart1;

public class fiboNacci {

    public static int fibo(int n, int f[]) {
        // base case
        if (n == 1 || n == 0) {
            return n;
        }
        // recursive work
        if (f[n] != 0) {
            return f[n];
        }
        // recureence relation
        f[n] = fibo(n - 1, f) + fibo(n - 2, f);
        return f[n];

    }

    public static void main(String[] args) {
        int n = 5;
        int f[] = new int[n + 1];
        System.out.println(fibo(n, f));
    }
}
