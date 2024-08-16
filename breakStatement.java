import java.util.Scanner;

public class breakStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int enter = sc.nextInt();
            if (enter % 10 == 0) {
                System.out.println("number is multiple of 10");
                break;
            } else {
                System.out.println(enter);
            }

        }
        sc.close();
    }
}
