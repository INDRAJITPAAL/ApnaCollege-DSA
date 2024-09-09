public class squareOfNInLogN {
    public static int squareN(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }


    public static void main(String[] args) {

      //  this is called fast exponentiation
        System.out.println(squareN(5, 3));
    }
}
