public class butterfly_pattern {
    public static void b_pattern(int n) {
        //1st half pattern
        for (int i = 1; i <= n; i++) {
            // str
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spc
            for (int j = 1; j <= (n-i)*2; j++) {
                System.out.print(" ");
            }
            // str
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }  
            System.out.println();
            
        }

        //2nd half pattern
        for (int i = n; i >= 1; i--) {
            // str
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spc
            for (int j = 1; j <= (n-i)*2; j++) {
                System.out.print(" ");
            }
            // str
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }  
            System.out.println();
            
        }

    }

    public static void main(String[] args) {
        b_pattern(10);
    }
}
