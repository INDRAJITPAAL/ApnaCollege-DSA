import java.util.Scanner;

public class evenoddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddSum = 0;
        int evenSum = 0;
        int count = 10;
        while (count > 0) {
            int integer = sc.nextInt();
            if (integer % 2 == 0) {
                evenSum += integer;
            } else {
                oddSum += integer;
            }
            count--;
        }
        System.out.println(evenSum + " evenSum ");
        System.out.println(oddSum + " oddSum ");
        sc.close();
    }

}
