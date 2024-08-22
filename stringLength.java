public class stringLength {
    public static void STRLen(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }

    }

    public static void main(String[] args) {
        String firstName = "indrajit";
        String lastName = "pal";
        String fullName = firstName + " " + lastName;
        STRLen(fullName);
    }

}
