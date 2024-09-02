public class usingCountTechnicToFindAngram {
    public static void anagramUsingCountingMethod(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println("this value are not an angram");
            return;
        }
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            freq1[str1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            freq2[str2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                System.out.println("not an angram");
                return;
            }
        }
        System.out.println("it is a angram");

    }

    public static void main(String[] args) {
        String str1 = "rat";
        String str2 = "rat";
        anagramUsingCountingMethod(str1, str2);

    }
}
