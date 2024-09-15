public class numberToStringMyCode {
    public static void changeNumberToString(String n, int idx, StringBuilder newstr) {
        if (n.charAt(n.length() - 1) == '0') {
            System.out.println("something went wrong ! the last digit cannot be zero");
            return;
        }
        // change integer to stringn
        if (idx == n.length()) {
            System.out.println(newstr);
            return;
        }
        // work
        if (n.charAt(idx) == '0') {
            newstr.append("zero ");
        }
        if (n.charAt(idx) == '1') {
            newstr.append("one ");
        }
        if (n.charAt(idx) == '2') {
            newstr.append("two ");
        }
        if (n.charAt(idx) == '3') {
            newstr.append("three ");
        }
        if (n.charAt(idx) == '4') {
            newstr.append("four ");
        }
        if (n.charAt(idx) == '5') {
            newstr.append("five ");
        }
        if (n.charAt(idx) == '6') {
            newstr.append("six ");
        }
        if (n.charAt(idx) == '7') {
            newstr.append("seven ");
        }
        if (n.charAt(idx) == '8') {
            newstr.append("eight ");
        }
        if (n.charAt(idx) == '9') {
            newstr.append("nine ");
        }
        // recursive work
        changeNumberToString(n, idx + 1, newstr);
    }

    public static void main(String[] args) {
        int n = 89;
        String str = String.valueOf(n);
        changeNumberToString(str, 0, new StringBuilder(""));
    }
}
