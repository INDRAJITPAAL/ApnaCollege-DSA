public class checkPrime {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=4;
        if(isPrime(n)){
            System.out.println("prime number");
        }else{
            System.out.println("not a prime number");
        }
    }
    
}
