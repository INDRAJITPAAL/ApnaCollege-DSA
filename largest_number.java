import java.util.*;

public class largest_number {
    public static int largestNumber(int number[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int number[] = { 12,0, 34, 65, 34, 23, 1, 1 };
        System.out.println(largestNumber(number));
    }
}
