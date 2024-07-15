public class Biunary_pattern {

    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (num % 2 == 0) {
                    // num+=1;
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
                num++;
            }
            System.out.println();
        }

    }
}
