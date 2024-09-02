import java.util.Arrays;

public class anagramTest {
     public static boolean anagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toUpperCase();
        str2 = str2.replaceAll("\\s", "").toUpperCase();
        if (str1.length() != str2.length()) {
            return false;
        }
        char charArray1[] = str1.toCharArray();
        char charArray2[] = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
    public static void main(String args[]) {
        String str1 = "lis ten";
        String str2 = "si lent";
        if (anagram(str1, str2)) {
            System.out.println(anagram(str1, str2));
        } else {
            System.out.println(anagram(str1, str2));
        }
    }
}
