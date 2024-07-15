public class PRimeNumber {
    public static void main(String[] args) {
        int n = 7;
        if (n == 2) {
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = true;
                }
            }

            if (isPrime) {
                System.out.println(n + " is not prime number");

            } else {
                System.out.println(n + " is a prime number");
            }

        }
    }
}
