import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("CALCULATOR : ");
            int num1 = sc.nextInt();
            char op = sc.next().charAt(0);
            int num2 = sc.nextInt();
            switch (op) {
                case '+':
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case '-':
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case '*':
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case '/':
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                case '%':
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                    break;
                default:
                    System.out.println(op + " this operator is invalid");
                    return;
                   
            }

            sc.close();
        }
    }
}