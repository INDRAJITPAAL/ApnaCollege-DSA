import java.util.Scanner;

public class sumOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long count=1;
        int sum=0;
        while (count <=n) {
            sum+=count;
            count++;

        }
        System.out.println(sum);
        sc.close();
    }
    
}
