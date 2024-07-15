public class TwoPyramid {
    public static void main(String[] args) {
        int row = 10;
        for (int i = 1; i <= row; i++) {

            // first pyramid

            for (int j = i; j <= row; j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 1; j <= i - 1; j++) {
                if (j % 2 == 0) {
                    System.out.print("^");
                } else {
                    System.out.print("-");
                }
            }
            for (int j = 1; j <= i - 1; j++) {
                if (j % 2 == 1) {
                    System.out.print("^");
                } else {
                    System.out.print("-");
                }
            }
            System.out.print("\\");

            // second pyramid

            for (int j = i; j <= row; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= row; j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 1; j <= i - 1; j++) {
                if (j % 2 == 0) {
                    System.out.print("^");
                } else {
                    System.out.print("-");
                }
            }
            for (int j = 1; j <= i - 1; j++) {
                if (j % 2 == 1) {
                    System.out.print("^");
                } else {
                    System.out.print("-");
                }
            }
            System.out.print("\\");
            System.out.println();
        }

        //buttom rectangle

        for (int i = 0; i <= 4; i++) {
            for (int k = 0; k <= row + row; k++) {
                if (k == 0 || k == row + row) {
                    System.out.print("|");

                } else {

                    System.out.print("*");
                }
                
            }
            System.out.print(" ");
            for (int k = 0; k <= row + row; k++) {
                if (k == 0 || k == row + row) {
                    System.out.print("|");

                } else {

                    System.out.print("*");
                }
                
            }
            System.out.println();

        }
        
    }
    
}
