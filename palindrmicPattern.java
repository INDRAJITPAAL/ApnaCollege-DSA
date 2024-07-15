public class palindrmicPattern {
    public static void main(String[] args) {
        int col = 5;
        for (int i = 1; i <= col; i++) {
            for (int j = i; j <= col; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
