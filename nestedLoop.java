public class nestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}
