public class phoneKeypadCompbinationRecursion {
    public static String keypad[] = { "0", "abc", "cde", "efg", "ghi", "jkl", "mno", "pqrs", "tu", "vwq", "yz" };

    public static void keyPadcombination(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            keyPadcombination(str, idx + 1, combination + mapping.charAt(i));
        }

    }

    public static void main(String[] args) {
        String str = "23";
        keyPadcombination(str, 0, "");
    }
}
