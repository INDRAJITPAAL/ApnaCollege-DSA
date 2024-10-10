public class checkFirstAndLastOccurenceRecursion {
    public static int firstIdx = -1;
    public static int secondIdx = -1;

    public static void firstLastOcurrence(String str, int idx, char Element) {
        if (idx == str.length()) {
            System.out.println(firstIdx);
            System.out.println(secondIdx);
            return;
        }
        if (str.charAt(idx) == Element) {
            if (firstIdx == -1) {
                firstIdx = idx;
            } else {
                secondIdx = idx;
            }
        }
        firstLastOcurrence(str, idx + 1, Element);
    }

    public static void main(String[] args) {
        String str = "dabaacdeabb";
        char Element = 'a';
        firstLastOcurrence(str, 0, Element);

    }
}
