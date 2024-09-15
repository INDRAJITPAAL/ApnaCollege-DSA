public class NumberToWords {

    // Helper function to get the word for a single digit
    public static String getWord(int digit) {
        switch (digit) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return ""; // This will never be reached as digits are in range 0-9
        }
    }

    // Recursive function to convert number to words
    public static void numberToWords(int n) {
        // Base case: when n becomes 0, stop the recursion
        if (n == 0) {
            return;
        }

        // Recursive call to process the next digits
        numberToWords(n / 10);

        // Extract the last digit and print its corresponding word
        System.out.print(getWord(n % 10) + " ");
    }

    public static void main(String[] args) {
        int number = 2019;

        // Check if the last digit is zero
        if (number % 10 == 0) {
            System.out.println("Error: The last digit of the number cannot be zero.");
            return;
        } else {
            // Edge case: If the number is 0, print "zero"
            if (number == 0) {
                System.out.println("zero");
            } else {
                numberToWords(number);
            }
        }
    }
}
