public class dimond_pattern {
    public static void d_pattern(int n) {

        for (int i = 1; i <= n; i++) {
            // spc
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // str
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            // spc
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // str
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        d_pattern(5);
    }
}
