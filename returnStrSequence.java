import java.util.*;

public class returnStrSequence {
    public static ArrayList<String> strsequenRetu(String str, String newStr) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(newStr);
            return list;
        }

        char curchar = str.charAt(0);
        ArrayList<String> left = strsequenRetu(str.substring(1), newStr + curchar);
        ArrayList<String> right = strsequenRetu(str.substring(1), newStr);
        left.addAll(right);
        return left;

    }

    public static void main(String[] args) {
        String str = "abc";
      System.out.println(strsequenRetu(str, ""));
    }
}
