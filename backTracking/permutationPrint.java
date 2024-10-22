package backTracking;

public class permutationPrint {
    public static void printP(String str,String ansStr) {
        if (str.isEmpty()) {
            System.out.println(ansStr);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printP(newStr, ansStr + curChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printP(str, "");
    }
}
