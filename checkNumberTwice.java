public class checkNumberTwice {

    public static boolean checkNumberTwice(int number[], int element) {
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == element) {
                count++;
            }
        }
        if (count >= 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 1 };
        int element = 1;
        System.out.println(checkNumberTwice(number, element));
    }
}
