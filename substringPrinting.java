public class substringPrinting {
    public static void subStringFind(String str, int si, int ei) {
        for (int i = si; i <= ei; i++) {
            System.out.print(str.charAt(i));
        }

    }

    public static void main(String[] args) {
        String str = "hello world";
        // printing substring
        int si = 0;
        int ei = 5;
        subStringFind(str, si, ei);
    }
}
