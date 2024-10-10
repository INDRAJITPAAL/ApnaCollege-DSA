public class leetcodeIsPalindrome {
    public static boolean solution(long x) {

        if (revers(x) != x) {
            return false;
        }
        return true;
    }

    public static long revers(long x) {
        long revers = 0;
        while (x > 0) {
            long LastD = x % 10;
            revers = revers * 10 + LastD;
            x = x / 10;

        }
        return revers;
    }

    public static void main(String[] args) {
        System.out.println(solution(121));
    }
}
