package leetCode;

class plusOne {
    public static int[] onePlus(int digits[]) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }
        int result[] = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int digits[] = { 9,9,9 };
        for (int AA : onePlus(digits)) {
            System.out.println(AA);
        }

    }
}