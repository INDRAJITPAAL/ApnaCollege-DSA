

public class CheckPrimeNumber {
    public static boolean checkPrime(int n) {
        boolean isprime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }

        return isprime;
    }

    public static void main(String[] args) {
        int n = 11;
        if(checkPrime(n)){
            System.out.println("prime number");
        }else{
            System.out.println("not a prime number");
        }

    }
}