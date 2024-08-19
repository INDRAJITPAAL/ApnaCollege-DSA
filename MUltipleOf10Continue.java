import java.util.Scanner;

public class MUltipleOf10Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int userNo = sc.nextInt();
            if (userNo % 10 == 0) {
                System.out.println("its not print enter other number :");
                continue;
            } else {
                System.out.println(userNo);

            }
        }
      
    }
}
