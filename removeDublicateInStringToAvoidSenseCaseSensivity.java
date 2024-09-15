public class removeDublicateInStringToAvoidSenseCaseSensivity {
    public static void removeDublicate(String str, int idx, StringBuffer newstr, boolean map[]) {
        // base case
        if (idx == str.length() - 1) {
            System.out.println(newstr);
            return;
        }
        // to avoid case sensivity with lowercase
        char ch = Character.toLowerCase(str.charAt(idx));
        // check map array is true or not
        if (map[ch - 'a']) {
            removeDublicate(str, idx + 1, newstr, map);
        } else {
            newstr.append(ch);
            map[ch - 'a'] = true;
            removeDublicate(str, idx + 1, newstr, map);
        }

    }

    public static void main(String[] args) {
        String str = "ApnaCollege";
        removeDublicate(str, 0, new StringBuffer(""), new boolean[26]);

    }
}
