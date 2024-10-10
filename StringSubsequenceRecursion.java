
public class StringSubsequenceRecursion {
    public static void subSeq(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // to be
        subSeq(str, idx + 1, newStr + (str.charAt(idx)));
        // do not be
        subSeq(str, idx + 1, newStr);
    }

    public static void main(String[] args) {
        String str = "abc";
        subSeq(str, 0, (""));
    }
}
// important from apnacollege code

