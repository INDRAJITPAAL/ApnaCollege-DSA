public class riverseOfN {
    public static void main(String[] args) {
        int n = 108990001;
        int reverse=0;
        while (n > 0) {
            int lastDigit = n % 10;
             reverse = (reverse * 10) + lastDigit;
             n /= 10;
            }
            System.out.print(reverse);
        System.out.println();
    }
}
