public class removeDublicateInStringToAvoidSenseCaseSensivity {
    public static void removeDublicate(String str, int idx, boolean map[], StringBuilder newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char curr = Character.toLowerCase(str.charAt(idx));
        if (map[curr - 'a'] == false) {
            map[curr - 'a'] = true;
            newStr.append(curr);
            removeDublicate(str, idx + 1, map, newStr);

        } else {
            removeDublicate(str, idx + 1, map, newStr);
        }
    }

    public static void main(String[] args) {
        String str = "ApnaCollege";
        removeDublicate(str, 0, new boolean[26], new StringBuilder(""));

    }
}
