public class printIncRecursion {
    public static void printenc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printenc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        printenc(10);
    }
}
