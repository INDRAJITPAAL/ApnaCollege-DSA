import java.util.Scanner;

public class SumEvenOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a set of integers separated by spaces: ");
            String input = scanner.nextLine();
            String[] numberStrings = input.split("\\s+");

            int[] numbers = new int[numberStrings.length];
            for (int i = 0; i < numberStrings.length; i++) {
                numbers[i] = Integer.parseInt(numberStrings[i]);
            }

            int evenSum = 0;
            int oddSum = 0;

            for (int num : numbers) {
                if (num % 2 == 0) {
                    evenSum += num;
                } else {
                    oddSum += num;
                }
            }

            System.out.println("Sum of even integers: " + evenSum);
            System.out.println("Sum of odd integers: " + oddSum);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter integers separated by spaces.");
        } finally {
            scanner.close();
        }
    }
}
