import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        int facto = 1;
        for (int i = Num; i >= 1; i--) {
            facto *= i;
        }
        System.out.println("Factorial of " + Num + " is = " + facto);

    }
}
