import java.util.Scanner;

public class maxOf3NUm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("a="+a);
            }else{
                System.out.println("c="+c);
            }
        }else if(b>c){
            System.out.println("b="+b);
        }else{
        }
            System.out.println("c="+c);
    }
}
