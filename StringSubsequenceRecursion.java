import java.util.ArrayList;

public class StringSubsequenceRecursion {
    public static ArrayList<String> strSubsequence(String str) {
        ArrayList<String> ans = new ArrayList<>();
        if (str.isEmpty()) {
            ans.add("");
            return ans;
        }

        char ch = str.charAt(0);
        ArrayList<String> ss = strSubsequence(str.substring(1));
        for (String a : ss) {
            ans.add(a);
            ans.add((ch + a));
        }

        return ans;

    }

    public static void main(String[] args) {
        for (String s : strSubsequence("abc")) {
            System.out.print(s + " ");
        }
    }
}
 