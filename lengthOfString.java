public class lengthOfString {
    public static void StrLength(String str, int count, int idx) {
        if (idx == str.length()) {
            System.out.println(count);
            return;
        }
        
            StrLength(str, count+1, idx + 1);
        
    }

    public static void main(String[] args) {
        String str = "IndrajitPal";
        StrLength(str, 0, 0);
    }
}
