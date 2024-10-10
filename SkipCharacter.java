public class SkipCharacter {
    public static String skipCha(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith("app") && !str.startsWith("apple")) {
            return skipCha(str.substring(3));
        } else {
            return str.charAt(0) + skipCha(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "baccdappdd";
        System.out.println(skipCha(str));
    }
}
//most important concept