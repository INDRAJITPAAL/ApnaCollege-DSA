public class modeExponentiation2 {
    public static long squareN(long a, long n,long mod) {
        long ans = 1;
        a=a%mod;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = (ans * a)%mod;
            }
            n = n >> 1;
            a = (a * a)%mod;
        }
        return ans;
    }

 

    public static void main(String[] args) {
        System.out.println(squareN(5, 117,19));
        // System.out.println(modeExpo(5, 117, 19));
    }
}
