public class friendParingProblem {
    public static int friendP(int n){
        if(n==1||n==2){
            return n;
        }
        return friendP(n-1)+(n-1)*friendP(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendP(5));
        
    }
}
