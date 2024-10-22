package backTracking;

public class findsubSet {
    public static void subSet(String str, int i, String newStr) {
        if (i == str.length()) {
            if(newStr.length()==0){
                System.out.println("null");
            }else{
                System.out.println(newStr);
            }
            return;
        }
        char curChar=str.charAt(i);
        subSet(str, i + 1, newStr +curChar);
        subSet(str, i + 1, newStr);

    }

    public static void main(String[] args) {
        String str = "abc";
        subSet(str, 0, (""));
    }
}
