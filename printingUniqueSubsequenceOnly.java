import java.util.HashSet;

public class printingUniqueSubsequenceOnly {
    public static void uniqueSubsequence(String str, int idx, String newStr, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newStr)) {
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        // to be
        uniqueSubsequence(str, idx + 1, newStr + str.charAt(idx), set);
        // to not be
        uniqueSubsequence(str, idx + 1, newStr, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubsequence(str, 0, "", set);
    }
}
