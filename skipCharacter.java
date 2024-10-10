public class skipCharacter {
    public static String skipCh(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith("app")) {
            return skipCh(str.substring(3));
        } else {
            return str.charAt(0) + skipCh(str.substring(1));
        }

    }

    public static void main(String[] args) {
        String str = "bacapplecdah";
        System.out.println(skipCh(str));
    }
}
