public class recursion1 {
    public static int rec(int n) {
        if (n == 0) {
            return 0;
        }
        System.out.println(n);
        return  rec(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(rec(5));
    }
}